CREATE TABLE `roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
);

CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
);

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `users_roles` (
  `user_id` bigint NOT NULL,
  `role_id` int NOT NULL,
  KEY `FKj6m8fwv7oqv74fcehir1a9ffy` (`role_id`),
  KEY `FK2o0jvgh89lemvvo17cbqvdxaa` (`user_id`),
  CONSTRAINT `FK2o0jvgh89lemvvo17cbqvdxaa` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `FKj6m8fwv7oqv74fcehir1a9ffy` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`)
);