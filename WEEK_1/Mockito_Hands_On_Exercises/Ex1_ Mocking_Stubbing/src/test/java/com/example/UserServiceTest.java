package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testFetchUser() {

        // Arrange
        UserRepository repository = mock(UserRepository.class);

        when(repository.getUserName(1))
                .thenReturn("Chandana");

        UserService service = new UserService(repository);

        // Act
        String result = service.fetchUser(1);

        // Assert
        assertEquals("Chandana", result);
    }
}
