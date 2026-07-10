package com.washington.vault;

import javax.crypto.SecretKey;

public class CryptoEngine {
    private static final int PBKDF2_ITERATIONS = 0;
    private static final int KEY_LENGTH_BITS = 0;
    private static final int SALT_LENGTH_BYTES = 0;
    private static final int IV_LENGTH_BYTES = 0;
    private static final int GCM_TAG_LENGTH_BITS = 0;

    public static byte[] generateSalt() {
        throw new UnsupportedOperationException("TODO: implementar geração de salt");
    }

    public static byte[] generateIV() {
        throw new UnsupportedOperationException("TODO: implementar geração de IV");
    }

    public static SecretKey deriveKey(char[] masterPassword, byte[] salt) throws Exception {
        throw new UnsupportedOperationException("TODO: implementar derivação de chave com PBKDF2");
    }

    public static byte[] encrypt(byte[] plaintext, SecretKey key, byte[] iv) throws Exception {
        throw new UnsupportedOperationException("TODO: implementar criptografia AES-GCM");
    }

    public static byte[] decrypt(byte[] ciphertext, SecretKey key, byte[] iv) throws Exception {
        throw new UnsupportedOperationException("TODO: implementar decriptação AES-GCM");
    }
}


