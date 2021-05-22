package org.cosybox.commons.uuid

import java.util.*

object UniqueId {

    /**
     * @since 1.0.0
     *
     * Generates random upper-case version 4 uuid.
     */
    fun generate(): String = UUID.randomUUID().toString().toUpperCase()

    /**
     * @since 1.1.0
     *
     * @param input character sequence to be checked.
     * @return true in case input argument is upper-case version 4 uuid.
     */
    fun isUniqueId(input: CharSequence): Boolean = input.length == 36 &&
            Regex("^[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}\$").matches(input)
}