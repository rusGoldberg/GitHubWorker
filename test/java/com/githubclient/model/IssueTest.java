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
