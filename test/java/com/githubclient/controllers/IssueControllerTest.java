package com.githubclient.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IssueControllerTest {

    private IssueController issueController;

    @BeforeEach
    void setUp() {
        issueController = new IssueController();
    }
