package com.cedricakrou.springjavaboilerplate;

import com.cedricakrou.springjavaboilerplate.password.PasswordGeneratorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>Password Generator.</p>
 *
 * @author KAKOU Akrou Cedric 2023-01-23
 */
class PasswordGeneratorTest {

  @Test
  void generatePassword_shouldStrongAndHave8Characters() {
    String password = new PasswordGeneratorImpl().generateRandomPassword(true, 8);

    Assertions.assertNotNull(password);
    Assertions.assertEquals(8, password.length());
    Assertions.assertTrue(password.matches(PasswordGeneratorImpl.STRONG_PASSWORD_REGEX));
  }

  @Test
  void generatePassword_shouldWeakAndHave3Characters() {
    String password = new PasswordGeneratorImpl().generateRandomPassword(true, 3);

    Assertions.assertNotNull(password);
    Assertions.assertEquals(8, password.length());
    Assertions.assertTrue(password.matches(PasswordGeneratorImpl.STRONG_PASSWORD_REGEX));
  }
}
