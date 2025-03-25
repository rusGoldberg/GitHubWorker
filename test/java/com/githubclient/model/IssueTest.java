package com.githubclient.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    private Issue issue;

    @BeforeEach
    void setUp() {
        User creator = new User("1", "testUser");
        issue = new Issue("1", "Test Issue", "This is a test issue", creator);
    }

    @Test
    void testGetters() {
        assertEquals("1", issue.getId());
        assertEquals("Test Issue", issue.getTitle());
        assertEquals("This is a test issue", issue.getBody());
        assertEquals("testUser", issue.getCreator().getUsername());
    }

    @Test
    void testSetters() {
        issue.setTitle("New Title");
        assertEquals("New Title", issue.getTitle());
    }
}
