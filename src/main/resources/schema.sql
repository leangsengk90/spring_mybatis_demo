/*
 Navicat Premium Data Transfer

 Source Server         : heroku_mybatis_db
 Source Server Type    : PostgreSQL
 Source Server Version : 140003
 Source Host           : ec2-52-204-195-41.compute-1.amazonaws.com:5432
 Source Catalog        : dsqsb6l15cret
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 140003
 File Encoding         : 65001

 Date: 02/06/2022 19:52:34
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
-- Sequence structure for app_user_id_seq1
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."app_user_id_seq1";
CREATE SEQUENCE "public"."app_user_id_seq1"
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."app_user_id_seq1" OWNER TO "yogpknaxreaxvp";

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
-- Sequence structure for author_id_seq1
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."author_id_seq1";
CREATE SEQUENCE "public"."author_id_seq1"
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."author_id_seq1" OWNER TO "yogpknaxreaxvp";

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
-- Sequence structure for book_id_seq1
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."book_id_seq1";
CREATE SEQUENCE "public"."book_id_seq1"
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."book_id_seq1" OWNER TO "yogpknaxreaxvp";

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
-- Sequence structure for role_id_seq1
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."role_id_seq1";
CREATE SEQUENCE "public"."role_id_seq1"
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;
ALTER SEQUENCE "public"."role_id_seq1" OWNER TO "yogpknaxreaxvp";

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
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."app_user_id_seq"
OWNED BY "public"."app_user"."id";
SELECT setval('"public"."app_user_id_seq"', 16, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."app_user_id_seq1"
OWNED BY "public"."app_user"."id";
SELECT setval('"public"."app_user_id_seq1"', 15, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."author_id_seq"
OWNED BY "public"."author"."id";
SELECT setval('"public"."author_id_seq"', 6, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."author_id_seq1"
OWNED BY "public"."author"."id";
SELECT setval('"public"."author_id_seq1"', 1, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."book_id_seq"
OWNED BY "public"."book"."id";
SELECT setval('"public"."book_id_seq"', 36, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."book_id_seq1"
OWNED BY "public"."book"."id";
SELECT setval('"public"."book_id_seq1"', 17, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."role_id_seq"
OWNED BY "public"."role"."id";
SELECT setval('"public"."role_id_seq"', 2, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."role_id_seq1"
OWNED BY "public"."role"."id";
SELECT setval('"public"."role_id_seq1"', 1, false);

-- ----------------------------
-- Primary Key structure for table app_user
-- ----------------------------
ALTER TABLE "public"."app_user" ADD CONSTRAINT "app_user_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table author
-- ----------------------------
ALTER TABLE "public"."author" ADD CONSTRAINT "author_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table book
-- ----------------------------
ALTER TABLE "public"."book" ADD CONSTRAINT "book_pkey" PRIMARY KEY ("id");

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
