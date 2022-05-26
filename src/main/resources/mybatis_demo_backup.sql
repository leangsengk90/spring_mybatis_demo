/*
 Navicat Premium Data Transfer

 Source Server         : postgres_conn
 Source Server Type    : PostgreSQL
 Source Server Version : 140001
 Source Host           : localhost:5432
 Source Catalog        : mybatis_demo
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 140001
 File Encoding         : 65001

 Date: 26/05/2022 08:11:48
*/


-- ----------------------------
-- Sequence structure for app_user_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."app_user_id_seq";
CREATE SEQUENCE "public"."app_user_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."app_user_id_seq" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Sequence structure for author_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."author_id_seq";
CREATE SEQUENCE "public"."author_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."author_id_seq" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Sequence structure for book_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."book_id_seq";
CREATE SEQUENCE "public"."book_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."book_id_seq" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Sequence structure for role_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."role_id_seq";
CREATE SEQUENCE "public"."role_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."role_id_seq" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Table structure for app_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."app_user";
CREATE TABLE "public"."app_user" (
  "id" int4 NOT NULL GENERATED ALWAYS AS IDENTITY (
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1
),
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "email" varchar(255) COLLATE "pg_catalog"."default",
  "password" varchar(255) COLLATE "pg_catalog"."default",
  "is_enabled" bool,
  "is_locked" bool
)
;
ALTER TABLE "public"."app_user" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Records of app_user
-- ----------------------------
BEGIN;
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (1, 'Seng', 'seng@gmail.com', '$2a$10$SKBPcNKNZtwJtDXzgbqK8eALJB2KRYxu4ozrwVjNU.0HF4YuVYkRW', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (2, 'dara', 'dara@gmail.com', '$2a$10$vOSWc/kuHX6CzDONXVrxCebY1UNnvFzJJLCwRMQ9Jiyf.0qgOae42', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (3, 'staff', 'staff@gmail.com', '$2a$10$GtjpshpcFJeu9SkCWRNIP.UPDGRMrgw5AVozNRiLFgvBiLHnJM6xq', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (4, 'admin', 'admin@gmail.com', '$2a$10$Bbtl0h80vJwYA8J66b1qUOkMmHnEH9B0bUezf4VMNYJ4zkWveDAH6', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (5, NULL, NULL, '$2a$10$rc0R7pcPXemwtbIM52Kaj.28DDxGn4ngXf1VFhDvolOJINZOvQsGK', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (6, NULL, 'test@gmail.com', '$2a$10$Hiv76RNRE/B2K9KsiovGIeEc6ShVe.yQ9nzK8ZNs7adKvk0CGWgLC', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (7, NULL, NULL, '$2a$10$sJl0Z7PjwYkxzpmiUSlbSudCtjbzpfthuVOeBaVavMmq2msv.N4am', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (8, NULL, NULL, '$2a$10$eFCrwmVWSp5Q.TZ35ePViOmU9LHEWfRvIVCCgE2C4nbEeZXiuAGna', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (9, NULL, 'test@gmail.com', '$2a$10$VLslLsKY8/JTcsNkfbMGDOGuUCu7V6coqkJ80aR7r1Ysq72lm1SWi', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (10, NULL, 'test@gmail.com', '$2a$10$EVu/cHLWQHCkXgt3/EzwZ.mR4UgBlh.1xj0HMBhfTSCefiqoc2XOK', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (11, NULL, 'test@gmail.com', '$2a$10$d/TVwtY4hCJjlBqlZeKrkuwLhopi/XOIQCAHwBoVeKM7ZTMoXD6OG', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (12, 'Kaka', 'kaka@gmail.com', '$2a$10$0arZcCw8y2nEyxFIDZB9w.Ff.6Vkzos8TEFXNFnQpTrg5NroEvdfu', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (13, 'Kao Leangseng', 'kaoleangseng@gmail.com', '$2a$10$./WbRLWS21wUCiVnuD98z.Sp65QV3nxg/mDr0ABenQOUoIzUX5.I2', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (14, 'Leangseng', 'kaoleangseng@gmail.com', '$2a$10$U9DgCyu/DH0qkWTk9WjAfOsZO/3PG9wzbCIuaj73BVQaiVqUJmiD6', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (15, '123', '123', '$2a$10$HGSXP0LcuWA71LTZzlygAu.BH8fcdIxia3RJRz/K28piP5ea4R0PO', NULL, NULL);
INSERT INTO "public"."app_user" ("id", "name", "email", "password", "is_enabled", "is_locked") OVERRIDING SYSTEM VALUE VALUES (16, '111', '222', '$2a$10$Y1khMbS8LAz2ZlWrrehmw.X2zcWoJvvshQ97c1qwPo3geYQySSnoq', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS "public"."author";
CREATE TABLE "public"."author" (
  "id" int4 NOT NULL GENERATED ALWAYS AS IDENTITY (
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1
),
  "name" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."author" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Records of author
-- ----------------------------
BEGIN;
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (1, 'dara');
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (2, 'bora');
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (3, 'nita');
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (4, 'jiva');
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (5, 'chenda');
INSERT INTO "public"."author" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (6, 'nara');
COMMIT;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS "public"."book";
CREATE TABLE "public"."book" (
  "id" int4 NOT NULL GENERATED ALWAYS AS IDENTITY (
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1
),
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "import_date" timestamp(6),
  "author_id" int4
)
;
ALTER TABLE "public"."book" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Records of book
-- ----------------------------
BEGIN;
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (2, 'JAVA', '2022-05-23 15:21:29.683199', 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (4, 'HTML', '2022-05-23 15:21:29.68437', 4);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (5, 'REACTJS', '2022-05-23 15:21:29.684852', 5);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (6, 'DATABASE', '2022-05-23 15:21:29.685316', 6);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (7, 'MS WORD', NULL, 1);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (8, 'MS WORD', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (11, 'MS WORD', NULL, 1);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (13, 'EXCEL', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (15, 'asdfsadf', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (16, 'MS WORD3', NULL, 3);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (17, 'MS WORD4', NULL, 4);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (18, 'MS WORD5', NULL, 5);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (19, 'MS WORD6', NULL, 6);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (20, 'bababa', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (22, 'MS WORD7', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (23, 'MS WORD8', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (24, 'MS WORD100', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (25, 'bababa', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (26, 'MS WORD101', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (27, 'MS WORD103', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (28, 'afdfa', NULL, NULL);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (29, 'MS WORD103', NULL, 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (30, 'bababa', '2020-01-01 00:00:00', 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (31, 'MS WORD105', NULL, 3);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (32, 'Dara', '2022-05-24 04:53:33.592', 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (33, 'COOKING', '2022-05-24 04:53:33.592', 3);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (34, 'COOKING2', '2022-05-24 04:53:33.592', 3);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (35, 'COOKING3', '2022-05-24 04:53:33.592', 3);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (36, 'COOKING4', '2022-05-24 04:53:33.592', 4);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (3, 'AAA', '2020-01-01 00:00:00', 2);
INSERT INTO "public"."book" ("id", "name", "import_date", "author_id") OVERRIDING SYSTEM VALUE VALUES (1, 'SQL3', '2022-05-24 04:53:33.592', 3);
COMMIT;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "public"."role";
CREATE TABLE "public"."role" (
  "id" int4 NOT NULL GENERATED ALWAYS AS IDENTITY (
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1
),
  "name" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."role" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Records of role
-- ----------------------------
BEGIN;
INSERT INTO "public"."role" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (1, 'ADMIN');
INSERT INTO "public"."role" ("id", "name") OVERRIDING SYSTEM VALUE VALUES (2, 'USER');
COMMIT;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_role";
CREATE TABLE "public"."user_role" (
  "user_id" int4 NOT NULL,
  "role_id" int4 NOT NULL
)
;
ALTER TABLE "public"."user_role" OWNER TO "yogpknaxreaxvp";

-- ----------------------------
-- Records of user_role
-- ----------------------------
BEGIN;
INSERT INTO "public"."user_role" ("user_id", "role_id") VALUES (1, 1);
INSERT INTO "public"."user_role" ("user_id", "role_id") VALUES (1, 2);
INSERT INTO "public"."user_role" ("user_id", "role_id") VALUES (2, 1);
INSERT INTO "public"."user_role" ("user_id", "role_id") VALUES (3, 2);
INSERT INTO "public"."user_role" ("user_id", "role_id") VALUES (4, 1);
COMMIT;

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."app_user_id_seq"
OWNED BY "public"."app_user"."id";
SELECT setval('"public"."app_user_id_seq"', 16, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."author_id_seq"
OWNED BY "public"."author"."id";
SELECT setval('"public"."author_id_seq"', 6, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."book_id_seq"
OWNED BY "public"."book"."id";
SELECT setval('"public"."book_id_seq"', 36, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."role_id_seq"
OWNED BY "public"."role"."id";
SELECT setval('"public"."role_id_seq"', 2, true);

-- ----------------------------
-- Auto increment value for app_user
-- ----------------------------
SELECT setval('"public"."app_user_id_seq"', 16, true);

-- ----------------------------
-- Primary Key structure for table app_user
-- ----------------------------
ALTER TABLE "public"."app_user" ADD CONSTRAINT "app_user_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Auto increment value for author
-- ----------------------------
SELECT setval('"public"."author_id_seq"', 6, true);

-- ----------------------------
-- Primary Key structure for table author
-- ----------------------------
ALTER TABLE "public"."author" ADD CONSTRAINT "author_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Auto increment value for book
-- ----------------------------
SELECT setval('"public"."book_id_seq"', 36, true);

-- ----------------------------
-- Primary Key structure for table book
-- ----------------------------
ALTER TABLE "public"."book" ADD CONSTRAINT "book_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Auto increment value for role
-- ----------------------------
SELECT setval('"public"."role_id_seq"', 2, true);

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE "public"."role" ADD CONSTRAINT "role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table user_role
-- ----------------------------
ALTER TABLE "public"."user_role" ADD CONSTRAINT "user_role_pkey" PRIMARY KEY ("user_id", "role_id");

-- ----------------------------
-- Foreign Keys structure for table book
-- ----------------------------
ALTER TABLE "public"."book" ADD CONSTRAINT "book_au_fk" FOREIGN KEY ("author_id") REFERENCES "public"."author" ("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- ----------------------------
-- Foreign Keys structure for table user_role
-- ----------------------------
ALTER TABLE "public"."user_role" ADD CONSTRAINT "role_fk" FOREIGN KEY ("role_id") REFERENCES "public"."role" ("id") ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE "public"."user_role" ADD CONSTRAINT "user_fk" FOREIGN KEY ("user_id") REFERENCES "public"."app_user" ("id") ON DELETE CASCADE ON UPDATE CASCADE;
