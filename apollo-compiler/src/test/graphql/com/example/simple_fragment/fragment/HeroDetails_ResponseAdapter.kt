// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.simple_fragment.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object HeroDetails_ResponseAdapter : ResponseAdapter<HeroDetails.HeroDetailsImpl> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?):
      HeroDetails.HeroDetailsImpl {
    val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
    return when(typename) {
      "Human" -> HumanHeroDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
      else -> OtherHeroDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
    }
  }

  override fun toResponse(writer: ResponseWriter, value: HeroDetails.HeroDetailsImpl) {
    when(value) {
      is HeroDetails.HumanHeroDetailsImpl -> HumanHeroDetailsImpl_ResponseAdapter.toResponse(writer, value)
      is HeroDetails.OtherHeroDetailsImpl -> OtherHeroDetailsImpl_ResponseAdapter.toResponse(writer, value)
    }
  }

  object HumanHeroDetailsImpl_ResponseAdapter : ResponseAdapter<HeroDetails.HumanHeroDetailsImpl> {
    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetails.HumanHeroDetailsImpl {
      return HeroDetails.HumanHeroDetailsImpl(HumanDetails_ResponseAdapter.fromResponse(reader, __typename))
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetails.HumanHeroDetailsImpl) {
      HumanDetails_ResponseAdapter.toResponse(writer, value.delegate)
    }
  }

  object OtherHeroDetailsImpl_ResponseAdapter : ResponseAdapter<HeroDetails.OtherHeroDetailsImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetails.OtherHeroDetailsImpl {
      return reader.run {
        var __typename: String? = __typename
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            else -> break
          }
        }
        HeroDetails.OtherHeroDetailsImpl(
          __typename = __typename!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetails.OtherHeroDetailsImpl) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    }
  }
}