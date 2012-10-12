package com.komodo.service.verification;

import com.komodo.model.Person;
import junit.framework.Assert;

public class IdVerificationTest {
    IdVerification verification = Mockito.mock(IdVerification.class);
    Person person = new Person("Drina","Someone");
    person.setSSN("ssn");
    person.setDateOfBirth("DOB");



    Assert.assertTrue(IdVerification.verify(person));
    Assert.assertFalse(IdVerification.verify(wrongPerson));
}
