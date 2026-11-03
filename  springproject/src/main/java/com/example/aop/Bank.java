package com.example.aop;

public class Bank {
    public void logBefore() {
        System.out.println("[LOG] Starting bank operation");
    }
    public void logAfter() {
        System.out.println("[LOG] Completed bank operation");
    }
}