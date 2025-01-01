package edu.GU.expensemanager;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class UserServiceTest {

    private UserService userService;
    private UserDao userDaoMock;

    @Before
    public void setUp() {
        // Create a mock instance of UserDao
        userDaoMock = mock(UserDao.class);
        // Initialize UserService with the mock DAO
        userService = new UserService(userDaoMock);
    }

    @Test
    public void testRegisterUser_Success() {
        // Arrange
        User user = new User("Jane Doe", "jane@example.com", "password123");
        when(userDaoMock.saveUser(user)).thenReturn(true);

        // Act
        boolean result = userService.registerUser(user);

        // Assert
        assertTrue("User should be registered successfully", result);
        verify(userDaoMock, times(1)).saveUser(user);  // Ensure saveUser was called once
    }

    @Test
    public void testRegisterUser_Failure() {
        // Arrange
        User user = new User("Jane Doe", "jane@example.com", "password123");
        when(userDaoMock.saveUser(user)).thenReturn(false);

        // Act
        boolean result = userService.registerUser(user);

        // Assert
        assertFalse("User registration should fail", result);
        verify(userDaoMock, times(1)).saveUser(user);  // Ensure saveUser was called once
    }

    @Test
    public void testGetUserDetails() {
        // Arrange
        String email = "jane@example.com";
        User mockUser = new User("Jane Doe", "jane@example.com", "password123");
        when(userDaoMock.getUserByEmail(email)).thenReturn(mockUser);

        // Act
        User result = userService.getUserDetails(email);

        // Assert
        assertNotNull("User should not be null", result);
        assertEquals("User email should match", email, result.getEmail());
    }
}
