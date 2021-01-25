package org.cosybox.commons.uuid

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class UniqueIdSpec {

    companion object {
        private const val UPPER_CASE_UUID_V4_REGEX = "^[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}\$"
    }

    @Test
    fun `Generates random upper-case version 4 uuid`() {
        val uniqueId = UniqueId.generate()

        assertEquals(36, uniqueId.length)
        assertTrue(uniqueId.matches(Regex(UPPER_CASE_UUID_V4_REGEX)))
    }
}