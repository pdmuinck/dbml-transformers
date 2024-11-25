CREATE TABLE `posts` (`id` integer PRIMARY KEY, `user_id` integer);
CREATE TABLE `users` (`id` integer);
CREATE TABLE `users_posts` (`users_id` integer, `posts_user_id` integer, PRIMARY KEY (`users_id`, `posts_user_id`));
ALTER TABLE `users_posts` ADD FOREIGN KEY (`users_id`) REFERENCES `users` (`id`);
ALTER TABLE `users_posts` ADD FOREIGN KEY (`posts_user_id`) REFERENCES `posts` (`user_id`);


