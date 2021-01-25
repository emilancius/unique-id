package org.cosybox.commons.uuid

import java.util.*

object UniqueId {

    /**
     * @since 1.0.0
     *
     * Generates random upper-case version 4 uuid.
     */
    fun generate(): String = UUID.randomUUID().toString().toUpperCase()
}