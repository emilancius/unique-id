package org.cosybox.commons.uuid

import org.cosybox.commons.uuid.UniqueId
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UniqueIdSpec {

    companion object {
        private const val UPPER_CASE_V4_UUID_REGEX = "^[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}$"
    }

    @Test
    fun `Generates random upper-case version 4 uuid`() {
        val uniqueId = UniqueId.generate()

        assertEquals(36, uniqueId.length)
        assertTrue(uniqueId.matches(Regex(UPPER_CASE_V4_UUID_REGEX)))
    }
}