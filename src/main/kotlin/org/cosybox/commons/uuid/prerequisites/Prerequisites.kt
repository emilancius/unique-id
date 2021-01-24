package org.cosybox.commons.uuid.prerequisites

import org.cosybox.commons.uuid.exception.PrerequisiteException

object Prerequisites {

    private const val UPPER_CASE_UUID_REGEX = "^[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}$"

    fun isUniqueId(characterSequence: CharSequence, error: String? = null) {
        if (characterSequence.length != 36 || !characterSequence.matches(Regex(UPPER_CASE_UUID_REGEX))) {
            throw PrerequisiteException(error ?: "\"$characterSequence\" is incorrect")
        }
    }
}