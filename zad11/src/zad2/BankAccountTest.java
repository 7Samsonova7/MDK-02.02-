package zad2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        BankAccount account = new BankAccount("Иван", "Петров");
        account.block();
        assertTrue(account.isBlocked(), "Счёт должен быть заблокирован после вызова block()");
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("Иван", "Петров");
        String[] fullName = account.getFullName();
        assertArrayEquals(new String[]{"Иван", "Петров"}, fullName, "Массив должен содержать имя и фамилию в правильном порядке");
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        BankAccount account = new BankAccount("Иван", "Петров");
        assertNull(account.getCurrency(), "Валюта неактивного счёта должна быть null");
    }


    @Test
    public void shouldThrowExceptionWhenGettingAmountOfNotActiveAccount() {
        BankAccount account = new BankAccount("Иван", "Петров");
        assertThrows(IllegalStateException.class, account::getAmount, "Вызов getAmount() на неактивном счёте должен выбрасывать IllegalStateException");
    }
}