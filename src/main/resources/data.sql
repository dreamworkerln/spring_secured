-- USERS CREDENTIALS

-- The encrypted password is `nooneguessthis`
INSERT INTO users (id, username, password, enabled) VALUES (1, 'admin', '{bcrypt}$2y$10$CrXT7.C1EReQ4w3yZnxQueai3Ig.s2xBDNLVJ209KdFOgJkXbJt6u', 1);
-- The encrypted password is `pass`
INSERT INTO users (id, username, password, enabled) VALUES (2, 'user', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC', 1);
-- The encrypted password is `pass`
INSERT INTO users (id, username, password, enabled) VALUES (3, 'guest', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC', 1);



INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_GUEST');
