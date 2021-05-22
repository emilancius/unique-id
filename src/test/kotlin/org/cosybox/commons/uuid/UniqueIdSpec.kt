package org.cosybox.commons.uuid

import org.junit.jupiter.api.Assertions.*
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

    @Test
    fun `Check passes in case provided input is upper-case version 4 uuid`() {
        assertTrue(UniqueId.isUniqueId("DCAA1BE9-3D1A-4F7A-9D22-AF0840A2DD8D"))
    }

    @Test
    fun `Check does not pass in case provided input is not upper-case version 4 uuid`() {
        assertFalse(UniqueId.isUniqueId(""))
        assertFalse(UniqueId.isUniqueId("ee9334cc-928c-4904-878c-b3ce5c8dd73e"))
    }
}