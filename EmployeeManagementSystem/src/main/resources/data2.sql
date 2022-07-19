
INSERT INTO `employee` (`id`, `email`, `first_name`, `last_name`) VALUES ('1', 'kritika@gmail.com', 'Kritika', 'Gupta');
INSERT INTO `employee` (`id`, `email`, `first_name`, `last_name`) VALUES ('2', 'harshita@gmail.com', 'Harshita', 'Sharma');
INSERT INTO `employee` (`id`, `email`, `first_name`, `last_name`) VALUES ('3', 'Bunny@gmail.com', 'Bunny', 'Verma');


INSERT INTO `roles` (`role_id`, `name`) VALUES ('1', 'ADMIN');
INSERT INTO `roles` (`role_id`, `name`) VALUES ('2', 'USER');

INSERT INTO `users` (`user_id`, `password`, `username`) VALUES ('1', '12345', 'adminuser');
INSERT INTO `users` (`user_id`, `password`, `username`) VALUES ('2', '12345', 'tempuser');

insert into `users_roles` (`user_id`, `role_id`) values(1, 1)
insert into `users_roles` (`user_id`, `role_id`) values(2, 2)