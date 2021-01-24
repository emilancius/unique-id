package org.cosybox.commons.uuid

import java.util.*

object UniqueId {

    /**
     * Generates random upper-case v4 uuid.
     */
    fun generate(): String = UUID.randomUUID().toString().toUpperCase()
}