CREATE SCHEMA `core`;
CREATE SCHEMA `blogging`;
CREATE TABLE IF NOT EXISTS `core`.`users` (`id` integer PRIMARY KEY);
CREATE TABLE IF NOT EXISTS `blogging`.`posts` (`id` integer PRIMARY KEY, `user_id` integer);
ALTER TABLE `blogging`.`posts` ADD FOREIGN KEY (`user_id`) REFERENCES `core`.`users` (`id`);
