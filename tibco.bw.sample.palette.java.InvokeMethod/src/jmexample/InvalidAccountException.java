package jmexample;

// Copyright 2003 - TIBCO Software Inc.
// ALL RIGHTS RESERVED

/**
 * Invalid customer account exception.
 */
@SuppressWarnings("serial")
public class InvalidAccountException extends Exception implements java.io.Serializable {

    public InvalidAccountException () {
    }

    public InvalidAccountException (String param1) {
        super(param1);
    }
}
