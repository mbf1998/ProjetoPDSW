-- MySQL Script generated by MySQL Workbench
-- Sat Apr 28 11:01:35 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema caminhodosbrindes
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema caminhodosbrindes
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `caminhodosbrindes` DEFAULT CHARACTER SET utf8 ;
USE `caminhodosbrindes` ;

-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_CartaodeCredito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_CartaodeCredito` (
  `ID_Cartao` INT NOT NULL,
  `Numero` INT NOT NULL,
  `CodigoSeguranca` INT NOT NULL,
  `NomeTitular` VARCHAR(45) NOT NULL,
  `Validade` DATE NOT NULL,
  `Bandeira` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`ID_Cartao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_Cliente` (
  `User_ID` INT NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(20) NOT NULL,
  `Login` VARCHAR(10) NOT NULL,
  `Senha` VARCHAR(12) NOT NULL,
  `Cartao` INT NULL,
  `sobrenome_usuario` VARCHAR(45) NOT NULL,
  `cidade_usuario` VARCHAR(45) NOT NULL,
  `bairro_usuario` VARCHAR(45) NOT NULL,
  `cep_usuario` INT NOT NULL,
  `telefone_usuario` INT NOT NULL,
  `celular_usuario` INT NOT NULL,
  PRIMARY KEY (`User_ID`),
  INDEX `Cartao_Usuario_idx` (`Cartao` ASC),
  CONSTRAINT `Cartao_Usuario`
    FOREIGN KEY (`Cartao`)
    REFERENCES `caminhodosbrindes`.`TB_CartaodeCredito` (`ID_Cartao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_Promocao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_Promocao` (
  `ID_Promocao` INT NOT NULL,
  `DataInicio` DATE NOT NULL,
  `DataFim` DATE NOT NULL,
  `DescontoPreco` FLOAT NOT NULL,
  PRIMARY KEY (`ID_Promocao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_Produto` (
  `ID_Produto` INT NOT NULL,
  `Nome` VARCHAR(20) NOT NULL,
  `Tamanho_Altura` FLOAT NOT NULL,
  `Tamanho_Largura` FLOAT NOT NULL,
  `Quantidade` INT NOT NULL,
  `Preco` FLOAT NULL,
  `Produto_Promocao` INT NULL,
  `Cor` LONGTEXT NOT NULL,
  `tipo` VARCHAR(100) NULL,
  `Descricao` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_Produto`),
  INDEX `Produto_Promocao_idx` (`Produto_Promocao` ASC),
  CONSTRAINT `Produto_Promocao`
    FOREIGN KEY (`Produto_Promocao`)
    REFERENCES `caminhodosbrindes`.`TB_Promocao` (`ID_Promocao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`Image`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`Image` (
  `Nome_image` VARCHAR(100) NOT NULL,
  `Image_01` LONGTEXT NOT NULL,
  `Image_02` LONGTEXT NOT NULL,
  `Image_03` LONGTEXT NULL,
  `id_image` INT NOT NULL,
  `Image_04` LONGTEXT NULL,
  `Image_05` LONGTEXT NULL,
  PRIMARY KEY (`id_image`),
  CONSTRAINT `ID_IMAGE`
    FOREIGN KEY (`id_image`)
    REFERENCES `caminhodosbrindes`.`TB_Produto` (`ID_Produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_Pedido` (
  `ID_Pedido` INT NOT NULL,
  `Status_Pedido` VARCHAR(45) NOT NULL,
  `Cartão_id` INT NOT NULL,
  `Arquivo_pedido` LONGTEXT NULL,
  `Quantidade_Pedido` INT NOT NULL,
  `Mensagem` VARCHAR(2000) NULL,
  `id_usu` INT NULL,
  `Cor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_Pedido`),
  INDEX `fk_TB_Produto_has_TB_User_TB_Produto1_idx` (`ID_Pedido` ASC),
  INDEX `Cartao_Id_idx` (`Cartão_id` ASC),
  INDEX `PedidoCL_idx` (`id_usu` ASC),
  CONSTRAINT `PedidoPP`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `caminhodosbrindes`.`TB_Produto` (`ID_Produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Cartao_Id`
    FOREIGN KEY (`Cartão_id`)
    REFERENCES `caminhodosbrindes`.`TB_CartaodeCredito` (`ID_Cartao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `PedidoCL`
    FOREIGN KEY (`id_usu`)
    REFERENCES `caminhodosbrindes`.`TB_Cliente` (`User_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caminhodosbrindes`.`TB_Administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caminhodosbrindes`.`TB_Administrador` (
  `id_Administrador` INT NOT NULL,
  `nome_Administrador` VARCHAR(45) NOT NULL,
  `email_Administrador` VARCHAR(45) NOT NULL,
  `senha_Administrador` VARCHAR(45) NOT NULL,
  `login_Administrador` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Administrador`),
  CONSTRAINT `id_criacao`
    FOREIGN KEY (`id_Administrador`)
    REFERENCES `caminhodosbrindes`.`TB_Produto` (`ID_Produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;