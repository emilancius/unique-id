package org.cosybox.commons.uuid.prerequisites

import org.cosybox.commons.uuid.exception.PrerequisiteException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PrerequisitesSpec {

    @Test
    fun `Given character sequence that is not 36 characters long, throws PrerequisiteException`() {
        assertThrows<PrerequisiteException> {
            Prerequisites.isUniqueId("75509829-C7A1-40C3-923B-18888E62967")
        }
    }

    @Test
    fun `Given character sequence that is not upper-case, throws PrerequisiteException`() {
        assertThrows<PrerequisiteException> {
            Prerequisites.isUniqueId("ecc5c740-a78c-4c3e-a575-e6o2sc8663e1")
        }
    }

    @Test
    fun `Given character sequence that is not formatted as upper-case uuid version 4, throws PrerequisiteException`() {
        assertThrows<PrerequisiteException> {
            Prerequisites.isUniqueId("1AE55BC1-B9-484E89-B4F6-999CEC180559")
        }
    }

    @Test
    fun `Given character sequence, that is upper-case uuid, does not throw PrerequisiteException`() {
        Prerequisites.isUniqueId("F1195284-13CA-483B-9149-3BD7132601F5")
    }
}