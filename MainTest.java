package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {


//    methods
//        Client   -   requestGrant
//        Client   -   getGrantStatus
//        Donor    -   donate
//        Donor    -   reviewPastDonations
    @Test
    public void main() {
        assertEquals(100, Donor.donate(100));


    }
}