CREATE TABLE IF NOT EXISTS `posts` (`id` integer PRIMARY KEY, `user_id` integer);
CREATE TABLE IF NOT EXISTS `users` (`id` integer);
ALTER TABLE `posts` ADD CONSTRAINT `fk_name` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
