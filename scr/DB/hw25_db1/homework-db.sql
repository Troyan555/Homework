-- MySQL Script generated by MySQL Workbench
-- Sun Mar 12 00:53:40 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Homework
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Homework
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Homework` DEFAULT CHARACTER SET utf8 ;
USE `Homework` ;

-- -----------------------------------------------------
-- Table `Homework`.`Homework`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Homework`.`Homework` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Homework`.`Lesson`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Homework`.`Lesson` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `updatedAt` VARCHAR(45) NULL,
  `homework_id` INT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `homework`
    FOREIGN KEY (`id`)
    REFERENCES `Homework`.`Homework` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Homework`.`Schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Homework`.`Schedule` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `updatedAt` VARCHAR(45) NULL,
  `lessons` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Homework`.`Lessons Scheduer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Homework`.`Lessons Scheduer` (
  `id` INT NOT NULL,
  `ScheduleID` INT NOT NULL,
  `LessonID` INT NOT NULL,
  PRIMARY KEY (`ScheduleID`, `LessonID`, `id`),
  INDEX `lessonsID_idx` (`LessonID` ASC) VISIBLE,
  CONSTRAINT `scheduleID`
    FOREIGN KEY (`ScheduleID`)
    REFERENCES `Homework`.`Schedule` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `lessonsID`
    FOREIGN KEY (`LessonID`)
    REFERENCES `Homework`.`Lesson` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;