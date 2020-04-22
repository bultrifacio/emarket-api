INSERT INTO emarket.role (id, name) values (0, 'ROLE_PRODUCER');
INSERT INTO emarket.role (id, name) values (1, 'ROLE_CONSUMER');

INSERT INTO emarket."user"(id, email, enabled, password, phone_number, photo_source, username) values (0, 'email', true, '$2y$12$zeOVZDpyClPjbijY3SJsf.ZlcMY.XlKLgUq/CNeYa/LBhNdf9dVYW', null, null, 'username');

INSERT INTO emarket.user_roles (user_d, roles_id) VALUES (0, 0);