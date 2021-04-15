package io.lighty.core.common.exceptions;

public class ModuleStartupException extends Exception {
    private static final long serialVersionUID = 1L;

    public ModuleStartupException() {
        super();
    }

    public ModuleStartupException(final String message) {
        super(message);
    }

    public ModuleStartupException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ModuleStartupException(final Throwable cause) {
        super(cause);
    }
}
