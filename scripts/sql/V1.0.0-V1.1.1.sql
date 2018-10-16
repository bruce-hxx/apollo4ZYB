ALTER TABLE ApolloPortalDB.Authorities MODIFY COLUMN Username varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;
INSERT INTO `ApolloPortalDB.ServerConfig` (`Key`, `Value`, `Comment`)
VALUES ('configView.memberOnly.envs', 'pro', '只对项目成员显示配置信息的环境列表，多个env以英文逗号分隔');