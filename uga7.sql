-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2018 a las 01:03:30
-- Versión del servidor: 5.7.11
-- Versión de PHP: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `uga7`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado`
--

CREATE TABLE `abogado` (
  `id_abogado` int(3) NOT NULL,
  `opciones` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogado`
--

INSERT INTO `abogado` (`id_abogado`, `opciones`) VALUES
(1, 'Publico'),
(2, 'Privado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificacion_d_h`
--

CREATE TABLE `calificacion_d_h` (
  `id_calificacion_dh` int(3) NOT NULL,
  `opciones` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `calificacion_d_h`
--

INSERT INTO `calificacion_d_h` (`id_calificacion_dh`, `opciones`) VALUES
(1, 'Si'),
(2, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carpeta`
--

CREATE TABLE `carpeta` (
  `id_carpeta` int(15) NOT NULL,
  `año` int(4) NOT NULL,
  `carpeta_de_investigacion` varchar(40) NOT NULL,
  `fk_csd` int(2) DEFAULT NULL,
  `fecha_de_inicio` date DEFAULT NULL,
  `fk_puesta_disposicion` int(10) DEFAULT NULL,
  `fk_procedencia` int(15) DEFAULT NULL,
  `m_p_propone` varchar(80) DEFAULT NULL,
  `carpeta_judicial` varchar(20) DEFAULT NULL,
  `carpetas_judiciales_acumuladas` varchar(90) DEFAULT NULL,
  `carpetas_de_origen_incompetencia` varchar(90) DEFAULT NULL,
  `fk_unidad_gestion` int(11) DEFAULT NULL,
  `fk_m_p_trabaja` int(15) DEFAULT NULL,
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `codigo_p` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carpeta`
--

INSERT INTO `carpeta` (`id_carpeta`, `año`, `carpeta_de_investigacion`, `fk_csd`, `fecha_de_inicio`, `fk_puesta_disposicion`, `fk_procedencia`, `m_p_propone`, `carpeta_judicial`, `carpetas_judiciales_acumuladas`, `carpetas_de_origen_incompetencia`, `fk_unidad_gestion`, `fk_m_p_trabaja`, `fecha`, `codigo_p`) VALUES
(24, 19, 'jhjh', 1, '2018-06-06', 1, 1, 'dcdcdfcdsfcds', 'cdjsdhgs', 'hjchdjhjdhjcdh', 'shdjshajdahjd', 5, 1, '2018-06-24 19:41:57', 0),
(25, 201, 'hjh', 1, NULL, 1, 1, '', '', '', '', 4, 1, '2018-06-24 19:41:57', 0),
(26, 2019, 'jjkjkj', 1, NULL, 1, 1, '', '', '', '', 1, 1, '2018-06-24 19:41:57', 0),
(27, 2019, 'hkhkkjkj', 1, NULL, 1, 1, '', '', '', '', 4, 1, '2018-06-24 19:41:57', 0),
(28, 2019, 'kkjkj', 2, NULL, 1, 1, '', '', '', '', NULL, 1, '2018-06-24 19:41:57', 0),
(29, 2019, 'kkjkj', 2, NULL, 1, 1, '', '', '', '', 2, 1, '2018-06-24 19:41:57', 0),
(30, 20, 'kkjkj', 2, NULL, 1, 1, '', '', '', '', 7, 1, '2018-06-24 19:41:57', 0),
(31, 2019, 'ihjh', 1, NULL, 1, NULL, '', '', '', '', NULL, 1, '2018-06-24 19:41:57', 0),
(32, 2019, 'ihjh', 1, NULL, 1, NULL, '', '', '', '', NULL, 1, '2018-06-24 19:41:57', 0),
(33, 201, 'hjh', 1, NULL, 1, NULL, '', '', '', '', NULL, 1, '2018-06-24 19:41:57', 0),
(34, 2019, 'kjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, 1, '2018-06-24 19:41:57', 0),
(35, 2019, 'jkjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(36, 2019, 'jkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(37, 2019, 'jhjhj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(38, 2019, 'kjkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(39, 2019, 'hjhjhj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(40, 2019, 'kjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(41, 2019, 'jkjkjk', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(42, 2019, 'jkjkjk', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(43, 2019, 'jkjkjk', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(44, 2019, 'careta', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(45, 2019, 'careta', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(46, 2019, 'caretaaa', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(47, 2019, 'caretaaa', 1, NULL, 2, 9, '', '', '', '', 3, 7, '2018-06-24 19:41:57', 0),
(48, 2019, 'jkkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(49, 201, 'kjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(50, 201, 'kjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(51, 20, 'kjkjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(52, 20, 'kkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(53, 20, 'kkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(54, 20, 'kkjkj', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(55, 29, 'jjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(56, 201, 'jjkjkjk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(57, 2019, 'kjkjkjk', 1, NULL, 2, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0),
(58, 2019, 'kjkjkjk', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(59, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(60, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(61, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(62, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(63, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(64, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(65, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(66, 2019, 'nueva', 1, '2018-05-03', 2, 5, 'jjkJKJkj', 'kjk', 'kjk', 'kj', 4, 3, '2018-06-24 19:41:57', 0),
(67, 2019, 'jkk', 1, NULL, 1, NULL, '', '', '', '', NULL, NULL, '2018-06-24 19:41:57', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `combo_c_s_d`
--

CREATE TABLE `combo_c_s_d` (
  `id_csd` int(2) NOT NULL,
  `opciones` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `combo_c_s_d`
--

INSERT INTO `combo_c_s_d` (`id_csd`, `opciones`) VALUES
(1, 'C/D'),
(2, 'S/D');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_espesificos_de_imputado`
--

CREATE TABLE `datos_espesificos_de_imputado` (
  `id_detos_extra` int(15) NOT NULL,
  `edad` int(3) NOT NULL,
  `representacion_consular` varchar(25) DEFAULT NULL,
  `ocupacion` varchar(50) DEFAULT NULL,
  `fk_abogado` int(3) DEFAULT NULL,
  `delito_primordial` varchar(200) NOT NULL,
  `modalidad_p` varchar(250) DEFAULT NULL,
  `otro_delito` varchar(250) DEFAULT NULL,
  `modalidad_s` varchar(250) DEFAULT NULL,
  `fk_calificacion_dh` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_espesificos_de_imputado`
--

INSERT INTO `datos_espesificos_de_imputado` (`id_detos_extra`, `edad`, `representacion_consular`, `ocupacion`, `fk_abogado`, `delito_primordial`, `modalidad_p`, `otro_delito`, `modalidad_s`, `fk_calificacion_dh`) VALUES
(22, 9, 'op', 'iu', 1, 'se', 'modalid', 'ana', 'nan', 1),
(23, 9, 'jhj', 'hj', 1, 'jhjh', '', '', '', 1),
(24, 9, 'bnbn', 'bnb', 1, 'nnm', '', '', '', 1),
(25, 9, 'jhj', 'jhjh', 1, 'jh', '', '', '', 1),
(26, 9, 'jhjhj', 'jhjh', 1, 'jhjh', '', '', '', 1),
(27, 9, 'jhjhj', 'jhjh', 1, 'jhjh', '', '', '', 1),
(28, 9, 'jhjhj', 'jhjh', 1, 'jhjh', '', '', '', 1),
(29, 9, 'hjhjh', 'jhjh', 1, 'jhj', '', '', '', 1),
(30, 9, 'hjhjh', 'jhjh', 1, 'jhj', '', '', '', 1),
(31, 9, 'hjhj', 'hjh', 1, 'h', '', '', 'hghg', 1),
(32, 9, 'jhj', 'jh', NULL, 'jhj', '', '', '', 1),
(33, 9, 'jkjkj', 'kj', NULL, 'kjk', '', '', '', 1),
(34, 9, 'hjhj', 'jh', NULL, 'hjhjj', 'jjhjh', '', '', NULL),
(35, 9, 'jhjh', 'jhjh', NULL, 'jhj', 'jhj', '', '', NULL),
(36, 9, 'jhjhj', 'hjhj', NULL, 'jhjh', '', '', '', NULL),
(37, 9, 'jhjh', 'hjh', NULL, 'hj', '', '', '', NULL),
(38, 9, 'jkjk', 'jkjkj', NULL, 'kjkjk', '', '', '', NULL),
(39, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(40, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(41, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(42, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(43, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(44, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(45, 9, 'kj', 'kjk', 2, 'jkjkj', 'kj', '', '', 2),
(46, 9, 'jhjhjh', 'jhjhj', NULL, 'jhjh', '', '', '', NULL),
(47, 9, 'jkj', 'kjkj', NULL, 'kjkjk', 'kjk', 'jkjk', 'kj', NULL),
(48, 9, 'jkj', 'kjkj', NULL, 'kjkjk', 'kjk', 'jkjk', 'kj', NULL),
(49, 9, 'kjk', 'jkjkjk', NULL, 'kjkjk', 'kj', 'kjk', '', NULL),
(50, 9, 'kj', 'kjk', NULL, 'kjkj', 'kjk', 'j', '', NULL),
(51, 9, 'kj', 'kjk', NULL, 'kjkj', 'kjk', 'j', '', NULL),
(52, 9, 'kj', 'kjk', NULL, 'kjkj', 'kjk', 'j', '', NULL),
(53, 9, 'jhj', 'hj', NULL, 'jh', '', '', '', NULL),
(54, 9, 'jhj', 'hjh', NULL, 'jhj', 'jh', '', 'jhjh', NULL),
(55, 9, 'jk', 'jkj', NULL, 'kjkj', 'kjk', 'kjk', '', NULL),
(56, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(57, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(58, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(59, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(60, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(61, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(62, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(63, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(64, 9, 'jk', 'jkj', 2, 'kjkj', 'kjk', 'kjk', 'kckc', 1),
(65, 9, 'kjkj', 'kj', NULL, 'kjkj', 'jkj', 'kj', '', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_espesificos_v`
--

CREATE TABLE `datos_espesificos_v` (
  `id_datos_espesificos_v` int(15) NOT NULL,
  `edad` int(3) DEFAULT NULL,
  `ocupacion` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_espesificos_v`
--

INSERT INTO `datos_espesificos_v` (`id_datos_espesificos_v`, `edad`, `ocupacion`) VALUES
(13, NULL, ''),
(14, NULL, ''),
(15, NULL, ''),
(16, NULL, ''),
(17, NULL, ''),
(18, NULL, ''),
(19, NULL, ''),
(20, NULL, ''),
(21, NULL, ''),
(22, NULL, ''),
(23, NULL, ''),
(24, NULL, ''),
(25, NULL, ''),
(26, NULL, ''),
(27, NULL, ''),
(28, NULL, ''),
(29, NULL, ''),
(30, NULL, ''),
(31, NULL, ''),
(32, NULL, ''),
(33, NULL, ''),
(34, NULL, ''),
(35, NULL, ''),
(36, NULL, ''),
(37, NULL, ''),
(38, NULL, ''),
(39, NULL, ''),
(40, NULL, ''),
(41, NULL, ''),
(42, NULL, ''),
(43, NULL, ''),
(44, NULL, ''),
(45, NULL, ''),
(46, NULL, ''),
(47, NULL, ''),
(48, NULL, ''),
(49, NULL, ''),
(50, NULL, ''),
(51, NULL, ''),
(52, NULL, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_actual_de_carpeta`
--

CREATE TABLE `estado_actual_de_carpeta` (
  `id_estado` int(15) NOT NULL,
  `opciones` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_actual_de_carpeta`
--

INSERT INTO `estado_actual_de_carpeta` (`id_estado`, `opciones`) VALUES
(2, 'RMA - PROCEDIMIENTO ABREVIADO'),
(3, 'RMA - PERDÓN'),
(4, 'RMA - SUSPENSIÓN CONDICIONAL'),
(5, 'RPA - SOBRESEIMIENTO'),
(6, 'RPA - ACUERDO REPARATORIO'),
(7, 'ACUSACIÓN Y SUSPENSIÓN DEL PROCESO'),
(8, 'SENTENCIA MIXTA'),
(9, 'SENTENCIA ABSOLUTORIA'),
(10, 'AUDIENCIA INTERMEDIA PENDIENTE DE CELEBRAR'),
(11, 'RPA - LITIGACIÓN PARA PROCEDIMIENTO ABREVIADO'),
(12, 'SENTENCIA CONDENATORIA'),
(13, 'INCOMPETENCIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `etapa_intermedia`
--

CREATE TABLE `etapa_intermedia` (
  `id_etapa_intermedia` int(15) NOT NULL,
  `opciones` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `etapa_intermedia`
--

INSERT INTO `etapa_intermedia` (`id_etapa_intermedia`, `opciones`) VALUES
(1, 'Si'),
(2, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fechas`
--

CREATE TABLE `fechas` (
  `id_fechas` int(15) NOT NULL,
  `fk_soluciones_alternas` int(15) DEFAULT NULL,
  `fecha_vinculacion_proceso` date DEFAULT NULL,
  `medidas_cautelares_art155` varchar(250) DEFAULT NULL,
  `fecha_medida_otorgada` date DEFAULT NULL,
  `fecha_plazo_cierre_investigacion` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `fecha_prorroga_investgacion` date DEFAULT NULL,
  `nueva_fecha_vencimiento_acusacion` date DEFAULT NULL,
  `fecha_envio_procedimiento_abreviado` date DEFAULT NULL,
  `fecha_envio_estudio_tecnico` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fechas`
--

INSERT INTO `fechas` (`id_fechas`, `fk_soluciones_alternas`, `fecha_vinculacion_proceso`, `medidas_cautelares_art155`, `fecha_medida_otorgada`, `fecha_plazo_cierre_investigacion`, `fecha_vencimiento`, `fecha_prorroga_investgacion`, `nueva_fecha_vencimiento_acusacion`, `fecha_envio_procedimiento_abreviado`, `fecha_envio_estudio_tecnico`) VALUES
(17, 17, '2018-06-15', 'yopi', '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15'),
(18, 18, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, 19, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, 20, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, 21, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, 22, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, 23, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, 24, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, 25, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, 26, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, 27, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, 28, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, 29, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, 30, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, 31, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, 32, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, 33, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, 34, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, 35, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, 36, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, 37, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, 38, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, 39, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, 40, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, 41, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, 42, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, 43, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, 44, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, 45, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, 46, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, 47, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, 48, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, 49, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, 50, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, 51, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(52, 52, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(53, 53, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(54, 54, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(55, 55, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(56, 56, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(57, 57, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(58, 58, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(59, 59, '2018-05-01', 'ccc', '2018-05-03', '2018-05-08', '2018-05-01', '2018-05-18', '2018-05-29', NULL, NULL),
(60, 60, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fecha_2`
--

CREATE TABLE `fecha_2` (
  `id_fecha2` int(15) NOT NULL,
  `motivo_de_suspencion_de_proceso` varchar(100) DEFAULT NULL,
  `fecha_criterio_oportunidad` date DEFAULT NULL,
  `fecha_orden_de_aprension_librada` date DEFAULT NULL,
  `fecha_orden_cumplida` date DEFAULT NULL,
  `fecha_orden_cancelada` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fecha_2`
--

INSERT INTO `fecha_2` (`id_fecha2`, `motivo_de_suspencion_de_proceso`, `fecha_criterio_oportunidad`, `fecha_orden_de_aprension_librada`, `fecha_orden_cumplida`, `fecha_orden_cancelada`) VALUES
(22, 'ypi', '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15'),
(23, '', NULL, NULL, NULL, NULL),
(24, '', NULL, NULL, NULL, NULL),
(25, '', NULL, NULL, NULL, NULL),
(26, '', NULL, NULL, NULL, NULL),
(27, '', NULL, NULL, NULL, NULL),
(28, '', NULL, NULL, NULL, NULL),
(29, '', NULL, NULL, NULL, NULL),
(30, '', NULL, NULL, NULL, NULL),
(31, '', NULL, NULL, NULL, NULL),
(32, '', NULL, NULL, NULL, NULL),
(33, '', NULL, NULL, NULL, NULL),
(34, '', NULL, NULL, NULL, NULL),
(35, '', NULL, NULL, NULL, NULL),
(36, '', NULL, NULL, NULL, NULL),
(37, '', NULL, NULL, NULL, NULL),
(38, '', NULL, NULL, NULL, NULL),
(39, '', NULL, NULL, NULL, NULL),
(40, '', NULL, NULL, NULL, NULL),
(41, '', NULL, NULL, NULL, NULL),
(42, '', NULL, NULL, NULL, NULL),
(43, '', NULL, NULL, NULL, NULL),
(44, '', NULL, NULL, NULL, NULL),
(45, '', NULL, NULL, NULL, NULL),
(46, '', NULL, NULL, NULL, NULL),
(47, '', NULL, NULL, NULL, NULL),
(48, '', NULL, NULL, NULL, NULL),
(49, '', NULL, NULL, NULL, NULL),
(50, '', NULL, NULL, NULL, NULL),
(51, '', NULL, NULL, NULL, NULL),
(52, '', NULL, NULL, NULL, NULL),
(53, '', NULL, NULL, NULL, NULL),
(54, '', NULL, NULL, NULL, NULL),
(55, '', NULL, NULL, NULL, NULL),
(56, '', NULL, NULL, NULL, NULL),
(57, '', NULL, NULL, NULL, NULL),
(58, '', NULL, NULL, NULL, NULL),
(59, '', NULL, NULL, NULL, NULL),
(60, '', NULL, NULL, NULL, NULL),
(61, '', NULL, NULL, NULL, NULL),
(62, '', NULL, NULL, NULL, NULL),
(63, '', NULL, NULL, NULL, NULL),
(64, '', NULL, NULL, NULL, NULL),
(65, '', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fecha_audiencia`
--

CREATE TABLE `fecha_audiencia` (
  `id_fecha_audiencia` int(15) NOT NULL,
  `opciones` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fecha_intermedia`
--

CREATE TABLE `fecha_intermedia` (
  `id_fecha_intermedia` int(15) NOT NULL,
  `fk_etapa_intermedia` int(15) DEFAULT NULL,
  `fecha_acusacion` date DEFAULT NULL,
  `fecha_audiencia_inter_señalada` varchar(90) DEFAULT NULL,
  `fecha_audiencia_inter_celebrada` date DEFAULT NULL,
  `apelacion_exclucion_suspende_procu` date DEFAULT NULL,
  `nombre_juez_control` varchar(80) DEFAULT NULL,
  `fecha_apertura_juicio_oral` date DEFAULT NULL,
  `carpeta_juicio` varchar(300) DEFAULT NULL,
  `fecha_celebracion_aud_juicio_oral` date DEFAULT NULL,
  `fecha_alegatos_clausura` date DEFAULT NULL,
  `fk_tipo_de_fallo` int(3) DEFAULT NULL,
  `fecha_de_fallo` date DEFAULT NULL,
  `fecha_audiencia_lectura_sentencia` date DEFAULT NULL,
  `fk_pena` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fecha_intermedia`
--

INSERT INTO `fecha_intermedia` (`id_fecha_intermedia`, `fk_etapa_intermedia`, `fecha_acusacion`, `fecha_audiencia_inter_señalada`, `fecha_audiencia_inter_celebrada`, `apelacion_exclucion_suspende_procu`, `nombre_juez_control`, `fecha_apertura_juicio_oral`, `carpeta_juicio`, `fecha_celebracion_aud_juicio_oral`, `fecha_alegatos_clausura`, `fk_tipo_de_fallo`, `fecha_de_fallo`, `fecha_audiencia_lectura_sentencia`, `fk_pena`) VALUES
(29, 1, '2018-06-15', 'yopi', '2018-06-15', '2018-06-15', 'yopi', '2018-06-15', 'ypi', '2018-06-15', '2018-06-15', 1, '2018-06-15', '2018-06-15', 29),
(30, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 30),
(31, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 31),
(32, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 32),
(33, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 33),
(34, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 34),
(35, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 35),
(36, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 36),
(37, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 37),
(38, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 38),
(39, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 39),
(40, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 40),
(41, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 41),
(42, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 42),
(43, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 43),
(44, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 44),
(45, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 45),
(46, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 46),
(47, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 47),
(48, 1, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 48),
(49, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 1, NULL, NULL, 49),
(50, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 50),
(51, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 51),
(52, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 52),
(53, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 53),
(54, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 54),
(55, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 55),
(56, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 56),
(57, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 57),
(58, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 58),
(59, 2, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, 2, NULL, NULL, 59),
(60, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 60),
(61, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 61),
(62, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 62),
(63, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 63),
(64, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 64),
(65, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 65),
(66, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 66),
(67, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 67),
(68, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 68),
(69, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 69),
(70, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', NULL, '2018-05-17', '2018-05-04', 70),
(71, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', NULL, '2018-05-17', '2018-05-04', 71),
(72, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', NULL, '2018-05-17', '2018-05-04', 72),
(73, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', NULL, '2018-05-17', '2018-05-04', 73),
(74, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', 2, '2018-05-17', '2018-05-04', 74),
(75, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', 2, '2018-05-17', '2018-05-04', 75),
(76, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', 2, '2018-05-17', '2018-05-04', 76),
(77, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', 2, '2018-05-17', '2018-05-04', 77),
(78, NULL, NULL, '', NULL, NULL, '', '2018-05-02', 'xxv', '2018-05-16', '2018-05-09', 2, '2018-05-17', '2018-05-04', 78),
(79, NULL, NULL, '', NULL, NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, 79);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hidtoria_carpeta`
--

CREATE TABLE `hidtoria_carpeta` (
  `idhistoria` int(15) NOT NULL,
  `opcioneshis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hidtoria_carpeta`
--

INSERT INTO `hidtoria_carpeta` (`idhistoria`, `opcioneshis`) VALUES
(1, 'Estudio'),
(2, 'Acusacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imputado`
--

CREATE TABLE `imputado` (
  `id_imputado` int(15) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido_p` varchar(25) NOT NULL,
  `apellido_m` varchar(25) NOT NULL,
  `alias` varchar(50) NOT NULL,
  `fk_sexo` int(2) DEFAULT NULL,
  `nacionalidad` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `imputado`
--

INSERT INTO `imputado` (`id_imputado`, `nombre`, `apellido_p`, `apellido_m`, `alias`, `fk_sexo`, `nacionalidad`) VALUES
(17, 'carlos', 'carla', 'nose', 'alia', 1, 'nacionali'),
(18, 'jhjh', 'jj', 'hjh', 'jh', 1, 'jhjh'),
(19, 'pedro', 'jhjhjh', 'jhj', 'hjhj', 1, 'bbn'),
(20, 'na', 'kjkj', 'kjkj', 'kjkj', 1, 'jhjh'),
(21, 'jj', 'jkjk', 'jk', 'jkj', 1, 'hjhjh'),
(22, 'jj', 'jkjk', 'jk', 'jkj', 1, 'hjhjh'),
(23, 'jj', 'jkjk', 'jk', 'jkj', 1, 'hjhjh'),
(24, 'jh', 'hjhj', 'hjh', 'jhjh', 1, 'jhjh'),
(25, 'jh', 'hjhj', 'hjh', 'jhjh', 1, 'jhjh'),
(26, 'jkjk', 'jkj', 'kjk', 'jkj', 1, 'jhjh'),
(27, 'hhjhj', 'hjhj', 'hjh', 'jhj', 1, 'jjhjh'),
(28, 'jkjk', 'jkjk', 'jk', 'jkj', 1, 'k'),
(29, 'hh', 'khjhj', 'hjhjh', 'jhjh', 1, 'jhjhj'),
(30, 'khjh', 'jhjh', 'jhj', 'jhj', 1, 'hhjh'),
(31, 'hjhj', 'hjhj', 'hjhj', 'hjh', 1, 'jhjhjh'),
(32, 'hjhjh', 'jhjhjh', 'jhjh', 'jhjh', 1, 'jhjhjhj'),
(33, 'k', 'jkjk', 'jkj', 'kjkj', 1, 'mmn'),
(34, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(35, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(36, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(37, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(38, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(39, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(40, 'jkjkj', 'kj', 'kj', 'kjk', 1, 'jkj'),
(41, 'khh', 'hjhjhj', 'hjhj', 'hjhj', 1, 'jhjhjhj'),
(42, 'kjkjk', 'jkj', 'kjk', 'jkj', 1, 'kjkj'),
(43, 'kjkjk', 'jkj', 'kjk', 'jkj', 1, 'kjkj'),
(44, 'jkjkk', 'kjk', 'jkjk', 'jk', 2, 'kjkjkj'),
(45, 'hk', 'khhh', 'jhj', 'hjh', NULL, 'jhjh'),
(46, 'jkjkj', 'kjk', 'jk', 'jkj', NULL, 'kjk'),
(47, 'jkjkj', 'kjk', 'jk', 'jkj', NULL, 'kjk'),
(48, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(49, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(50, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(51, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(52, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(53, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(54, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(55, 'jkjkj', 'kjk', 'jk', 'jkj', 1, 'kjk'),
(56, 'kjkj', 'kjk', 'jk', 'jkj', NULL, 'kjkj');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juez_de_tuno_control_nombre`
--

CREATE TABLE `juez_de_tuno_control_nombre` (
  `id_nombre_juez_control_turno` int(15) NOT NULL,
  `nombre_s` varchar(40) DEFAULT NULL,
  `apellido_p` varchar(20) DEFAULT NULL,
  `apellido_m` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `juez_de_tuno_control_nombre`
--

INSERT INTO `juez_de_tuno_control_nombre` (`id_nombre_juez_control_turno`, `nombre_s`, `apellido_p`, `apellido_m`) VALUES
(15, '', '', ''),
(16, '', '', ''),
(17, '', '', ''),
(18, '', '', ''),
(19, '', '', ''),
(20, '', '', ''),
(21, '', '', ''),
(22, '', '', ''),
(23, '', '', ''),
(24, '', '', ''),
(25, '', '', ''),
(26, '', '', ''),
(27, '', '', ''),
(28, '', '', ''),
(29, '', '', ''),
(30, '', '', ''),
(31, '', '', ''),
(32, '', '', ''),
(33, '', '', ''),
(34, '', '', ''),
(35, '', '', ''),
(36, '', '', ''),
(37, '', '', ''),
(38, '', '', ''),
(39, '', '', ''),
(40, '', '', ''),
(41, '', '', ''),
(42, '', '', ''),
(43, '', '', ''),
(44, '', '', ''),
(45, '', '', ''),
(46, '', '', ''),
(47, '', '', ''),
(48, '', '', ''),
(49, 'jkjk', 'jkj', 'kj'),
(50, 'jkjk', 'jkj', 'kj'),
(51, 'jkjk', 'jkj', 'kj'),
(52, 'jkjk', 'jkj', 'kj'),
(53, 'jkjk', 'jkj', 'kj'),
(54, 'jkjk', 'jkj', 'kj'),
(55, 'jkjk', 'jkj', 'kj'),
(56, 'jkjk', 'jkj', 'kj'),
(57, 'jkjk', 'jkj', 'kj'),
(58, '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `codigo` tinyint(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `url` varchar(100) DEFAULT NULL,
  `tipo` enum('S','I') NOT NULL,
  `tipoUsuario` enum('A','O','S') NOT NULL,
  `codigo_submenu` tinyint(4) DEFAULT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`codigo`, `nombre`, `url`, `tipo`, `tipoUsuario`, `codigo_submenu`, `estado`) VALUES
(1, 'Usuarios', NULL, 'S', 'A', NULL, b'1'),
(2, 'Crear Usuario', '#{usuarioBean.ab()}', 'I', 'A', 1, b'1'),
(5, 'Consultar', NULL, 'S', 'A', NULL, b'1'),
(6, 'Consultar Carpeta', '#{usuarioBean.ac()}', 'I', 'A', 5, b'1'),
(7, 'Consultar Usuario', '#{usuarioBean.ae()}', 'I', 'A', 5, b'1'),
(8, 'Fase inicial', NULL, 'S', 'O', NULL, b'1'),
(9, 'Ingresar nueva carpeta', '#{usuarioBean.ag()}', 'I', 'O', 8, b'1'),
(10, 'Agregar', '', 'S', 'A', NULL, b'1'),
(11, 'Puesta a disposicion', '#{usuarioBean.ab6()}', 'I', 'A', 10, b'1'),
(12, 'Procedencia', '#{usuarioBean.abcd()}', 'I', 'A', 10, b'1'),
(13, 'Unidad de gestion', '#{usuarioBean.ab2()}', 'I', 'A', 10, b'1'),
(14, 'MP que trabaja', '#{usuarioBean.ab1()}', 'I', 'A', 10, b'1'),
(15, 'Reparacion del daño', '#{usuarioBean.ab10()}', 'I', 'A', 10, b'1'),
(16, 'Fecha audiencia', '#{}', 'I', 'A', 10, b'1'),
(17, 'Resolucion de apelacion M.P ', '#{usuarioBean.ab101()}', 'I', 'A', 10, b'1'),
(18, 'opciones (se concede)', '#{}', 'I', 'A', 10, b'1'),
(19, 'Estado actual de carpeta', '#{}', 'I', 'A', 10, b'1'),
(20, 'Nombre juez control turno', '#{}', 'I', 'A', 10, b'1'),
(21, 'Buscar', '', 'S', 'O', NULL, b'1'),
(22, 'Realizar Busqueda', '#{usuarioBean.ac23()}', 'I', 'O', 21, b'1'),
(23, 'Buscar Carpeta', '#{usuarioBean.am()}', 'I', 'O', 21, b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modifica_carpeta_usuario`
--

CREATE TABLE `modifica_carpeta_usuario` (
  `id_modifica` int(11) NOT NULL,
  `fk_carpeta` int(15) NOT NULL,
  `fk_persona` int(20) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mp_que_trabaja`
--

CREATE TABLE `mp_que_trabaja` (
  `id_mp_trabaja` int(15) NOT NULL,
  `nombre_de_mp` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mp_que_trabaja`
--

INSERT INTO `mp_que_trabaja` (`id_mp_trabaja`, `nombre_de_mp`) VALUES
(1, 'LIC. LUIS RODRIGO ARELLANO SANDOVAL'),
(2, 'GONZÁLEZ JOYA HÉCTOR'),
(3, 'ESQUIVEL MARTÍNEZ MARÍA ALEJANDRA'),
(4, 'GONZÁLEZ DOURIET ENRIQUE'),
(5, 'JAZMIN LIRA LOPEZ'),
(6, 'LIC. ROSA ALICIA MOCTEZUMA LULE'),
(7, 'LIC. CESAR MIGUEL TOVAR GARCÍA'),
(8, 'ESQUIVEL MARTÍNEZ MARÍA ALEJANDRA'),
(9, 'LIC. SUSANA GUTIÉRREZ GONZÁLEZ'),
(10, 'ROMERO AMAYA MOISÉS'),
(11, 'LIC. JAIME JAVIER PÉREZ PÉREZ'),
(12, 'LIC. JOSÉ LUIS ANAYA TREJO'),
(13, 'CASTAÑEDA ACERO FELIPE'),
(14, 'LIC. DIANA MEZA QUINTANA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pena`
--

CREATE TABLE `pena` (
  `id_pena` int(15) NOT NULL,
  `año` int(4) DEFAULT NULL,
  `mes` varchar(20) DEFAULT NULL,
  `dia` int(3) DEFAULT NULL,
  `multa` varchar(25) DEFAULT NULL,
  `fk_reparacion_daño` int(15) DEFAULT NULL,
  `observacion_de_la_reparacion` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pena`
--

INSERT INTO `pena` (`id_pena`, `año`, `mes`, `dia`, `multa`, `fk_reparacion_daño`, `observacion_de_la_reparacion`) VALUES
(29, 2019, 'octubre', 15, 'nose', 1, 'nose'),
(30, NULL, '', NULL, '', 1, ''),
(31, NULL, '', NULL, '', 1, ''),
(32, NULL, '', NULL, '', 1, ''),
(33, NULL, '', NULL, '', 1, ''),
(34, 20, 'enero', 1, '', 1, ''),
(35, NULL, '', NULL, '', 1, ''),
(36, NULL, '', NULL, '', 1, ''),
(37, NULL, '', NULL, '', 1, ''),
(38, NULL, '', NULL, '', 1, ''),
(39, NULL, '', NULL, '', 1, ''),
(40, NULL, '', NULL, '', 1, ''),
(41, NULL, '', NULL, '', 1, ''),
(42, NULL, '', NULL, '', 1, ''),
(43, NULL, '', NULL, '', 1, ''),
(44, NULL, '', NULL, '', 1, ''),
(45, NULL, '', NULL, '', 1, ''),
(46, NULL, '', NULL, '', 1, ''),
(47, NULL, '', NULL, '', 1, ''),
(48, NULL, '', NULL, '', 1, ''),
(49, NULL, '', NULL, '', 1, ''),
(50, NULL, '', NULL, '', 1, ''),
(51, NULL, '', NULL, '', 1, ''),
(52, NULL, '', NULL, '', NULL, ''),
(53, NULL, '', NULL, '', 2, ''),
(54, NULL, '', NULL, '', 2, ''),
(55, NULL, '', NULL, '', 2, ''),
(56, NULL, '', NULL, '', 2, ''),
(57, NULL, '', NULL, '', 2, ''),
(58, NULL, '', NULL, '', 2, ''),
(59, NULL, '', NULL, '', 2, ''),
(60, NULL, '', NULL, '', NULL, ''),
(61, NULL, '', NULL, '', NULL, ''),
(62, NULL, '', NULL, '', NULL, ''),
(63, NULL, '', NULL, '', NULL, ''),
(64, NULL, '', NULL, '', NULL, ''),
(65, NULL, '', NULL, '', NULL, ''),
(66, NULL, '', NULL, '', NULL, ''),
(67, NULL, '', NULL, '', NULL, ''),
(68, NULL, '', NULL, '', NULL, ''),
(69, NULL, '', NULL, '', NULL, ''),
(70, NULL, '', NULL, '', NULL, ''),
(71, NULL, '', NULL, '', NULL, ''),
(72, NULL, '', NULL, '', NULL, ''),
(73, NULL, '', NULL, '', NULL, ''),
(74, NULL, '', NULL, '', NULL, ''),
(75, NULL, '', NULL, '', NULL, ''),
(76, NULL, '', NULL, '', NULL, ''),
(77, 2019, 'kk', 9, 'jkjk', NULL, 'jk'),
(78, 2019, 'kk', 9, 'jkjk', 2, 'jk'),
(79, NULL, '', NULL, '', NULL, ''),
(80, NULL, NULL, NULL, NULL, NULL, NULL),
(81, NULL, NULL, NULL, NULL, NULL, NULL),
(82, NULL, NULL, NULL, NULL, NULL, NULL),
(83, NULL, NULL, NULL, NULL, NULL, NULL),
(84, NULL, NULL, NULL, NULL, NULL, NULL),
(85, NULL, NULL, NULL, NULL, NULL, NULL),
(86, NULL, NULL, NULL, NULL, NULL, NULL),
(87, NULL, NULL, NULL, NULL, NULL, NULL),
(88, NULL, NULL, NULL, NULL, NULL, NULL),
(89, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `codigo_p` int(20) NOT NULL,
  `nombres` varchar(60) NOT NULL,
  `apellidos` varchar(60) NOT NULL,
  `sexo` enum('M','F') NOT NULL,
  `fecha_de_nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`codigo_p`, `nombres`, `apellidos`, `sexo`, `fecha_de_nacimiento`) VALUES
(1, 'su', 'bcbc', 'F', '2018-05-09'),
(2, 'ana', 'avila', 'F', '2018-04-13'),
(4, 'karen', 'avila', 'F', '2018-04-13'),
(15, 'andy', 'xncxcn', 'M', '2018-05-12'),
(16, 'carlos', 'avila', 'F', '2018-04-13'),
(17, 'jdjd', 'avila', 'F', '2018-04-13'),
(18, 'andree', 'rome', 'M', '2018-05-10'),
(19, 'ana', 'jkj', 'M', '2018-05-30'),
(20, 'andy', 'ana', 'M', '2018-05-31'),
(21, 'shs', 'nccnc', 'F', '2018-05-21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procedencia`
--

CREATE TABLE `procedencia` (
  `id_procedencia` int(15) NOT NULL,
  `nombre_fiscalia` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `procedencia`
--

INSERT INTO `procedencia` (`id_procedencia`, `nombre_fiscalia`) VALUES
(1, 'Narcomenudeo'),
(2, 'Azcapotzalco'),
(3, 'Iztapalapa'),
(4, 'Gustavo A. Madero'),
(5, 'Cuauhtémoc'),
(6, 'Robo de Vehículos y Transporte'),
(7, 'Álvaro Obregón'),
(8, 'Venustiano Carranza'),
(9, 'Miguel Hidalgo'),
(10, 'Xochimilco'),
(11, 'NarcoMenudeo'),
(18, 'Iztacalco'),
(19, 'Benito Juarez'),
(20, 'Cuajimalpa'),
(21, 'Coyoacan'),
(22, 'Agencias de Atención Especializada'),
(23, 'Niños, Niñas Y Adolecentes'),
(24, 'Tlalpan'),
(25, 'Magdalena Contreras'),
(26, 'Ambientales y Protección Urbana'),
(27, 'Sexuales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procedimiento_abreviado`
--

CREATE TABLE `procedimiento_abreviado` (
  `id_procedimiento_abr` int(3) NOT NULL,
  `opciones` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `procedimiento_abreviado`
--

INSERT INTO `procedimiento_abreviado` (`id_procedimiento_abr`, `opciones`) VALUES
(1, 'Si'),
(2, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procedi_abreviado_t`
--

CREATE TABLE `procedi_abreviado_t` (
  `id_procedimiento` int(15) NOT NULL,
  `fk_procedimiento_op` int(3) DEFAULT NULL,
  `fecha_sentencia_proc_abreviado` date DEFAULT NULL,
  `fk_tipode_fallo` int(3) DEFAULT NULL,
  `fecha_de_sobreseimiento` date DEFAULT NULL,
  `sobreseimiento` varchar(100) DEFAULT NULL,
  `Numero_oficio` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `procedi_abreviado_t`
--

INSERT INTO `procedi_abreviado_t` (`id_procedimiento`, `fk_procedimiento_op`, `fecha_sentencia_proc_abreviado`, `fk_tipode_fallo`, `fecha_de_sobreseimiento`, `sobreseimiento`, `Numero_oficio`) VALUES
(17, 1, '2018-06-15', 1, '2018-06-15', 'yop', '98'),
(18, 1, NULL, 1, NULL, '', ''),
(19, 1, NULL, 1, NULL, '', ''),
(20, 1, NULL, 1, NULL, '', ''),
(21, 1, NULL, 1, NULL, '', ''),
(22, 1, NULL, 1, NULL, '', ''),
(23, 1, NULL, 1, NULL, '', ''),
(24, 1, NULL, 1, NULL, '', ''),
(25, 1, NULL, 1, NULL, '', ''),
(26, 1, NULL, 1, NULL, '', ''),
(27, 1, NULL, 1, NULL, '', ''),
(28, 1, NULL, 1, NULL, '', ''),
(29, 1, NULL, 1, NULL, '', ''),
(30, 1, NULL, 1, NULL, '', ''),
(31, 1, NULL, NULL, NULL, '', ''),
(32, 1, NULL, NULL, NULL, '', ''),
(33, 1, NULL, NULL, NULL, '', ''),
(34, 1, NULL, 2, NULL, '', ''),
(35, 1, NULL, 2, NULL, '', ''),
(36, 1, NULL, 2, NULL, '', ''),
(37, 1, NULL, 2, NULL, '', ''),
(38, 1, NULL, 2, NULL, '', ''),
(39, 1, NULL, 2, NULL, '', ''),
(40, 1, NULL, 2, NULL, '', ''),
(41, 1, NULL, NULL, NULL, '', ''),
(42, NULL, NULL, NULL, NULL, '', ''),
(43, NULL, NULL, NULL, NULL, '', ''),
(44, NULL, NULL, NULL, NULL, '', ''),
(45, NULL, NULL, NULL, NULL, '', ''),
(46, NULL, NULL, NULL, NULL, '', ''),
(47, NULL, NULL, NULL, NULL, '', ''),
(48, NULL, NULL, NULL, NULL, '', ''),
(49, NULL, NULL, NULL, NULL, '', ''),
(50, NULL, NULL, NULL, NULL, '', ''),
(51, NULL, NULL, NULL, NULL, '', 'jcjcjc'),
(52, NULL, NULL, NULL, NULL, '', 'jcjcjc'),
(53, NULL, NULL, NULL, NULL, '', 'jcjcjc'),
(54, NULL, NULL, NULL, NULL, '', 'jcjcjc'),
(55, 2, '2018-05-31', 2, NULL, '', 'jcjcjc'),
(56, 2, '2018-05-31', 2, NULL, '', 'jcjcjc'),
(57, 2, '2018-05-31', 2, NULL, '', 'jcjcjc'),
(58, 2, '2018-05-31', 2, NULL, '', 'jcjcjc'),
(59, 2, '2018-05-31', 2, NULL, '', 'jcjcjc'),
(60, NULL, NULL, NULL, NULL, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesta_a_disposicion`
--

CREATE TABLE `puesta_a_disposicion` (
  `id_puesta_disp` int(10) NOT NULL,
  `opciones` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `puesta_a_disposicion`
--

INSERT INTO `puesta_a_disposicion` (`id_puesta_disp`, `opciones`) VALUES
(1, 'SSP'),
(2, 'PBI'),
(3, 'PI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_carpeta_historia`
--

CREATE TABLE `relacion_carpeta_historia` (
  `idrelacioncarphis` int(15) NOT NULL,
  `fk_historia_op` int(15) NOT NULL,
  `fk_carpeta` int(15) NOT NULL,
  `fecha_de_llegada` date NOT NULL,
  `observaciones` varchar(1000) DEFAULT NULL,
  `Asuntos_concluidos` varchar(900) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_carpeta_historia`
--

INSERT INTO `relacion_carpeta_historia` (`idrelacioncarphis`, `fk_historia_op`, `fk_carpeta`, `fecha_de_llegada`, `observaciones`, `Asuntos_concluidos`) VALUES
(24, 2, 24, '2018-05-20', 'znczhchjdhjh', 'jjvbnvb'),
(25, 1, 25, '2018-05-11', '', ''),
(26, 2, 26, '2018-05-26', '', ''),
(27, 1, 27, '2018-05-10', '', ''),
(28, 2, 28, '2018-05-04', '', ''),
(29, 2, 29, '2018-05-04', '', ''),
(30, 2, 30, '2018-05-04', '', ''),
(31, 2, 31, '2018-05-04', '', ''),
(32, 2, 32, '2018-05-04', '', ''),
(33, 2, 33, '2018-05-05', '', ''),
(34, 2, 34, '2018-05-04', '', ''),
(35, 2, 35, '2018-05-04', '', ''),
(36, 1, 36, '2018-05-03', '', ''),
(37, 2, 37, '2018-05-04', '', ''),
(38, 2, 38, '2018-05-04', '', ''),
(39, 1, 39, '2018-05-03', '', ''),
(40, 2, 40, '2018-05-03', '', ''),
(41, 2, 41, '2018-05-04', '', ''),
(42, 2, 42, '2018-05-04', '', ''),
(43, 2, 43, '2018-05-04', '', ''),
(44, 2, 44, '2018-05-04', '', ''),
(45, 2, 45, '2018-05-04', '', ''),
(46, 2, 46, '2018-05-04', '', ''),
(47, 2, 47, '2018-05-04', '', ''),
(48, 1, 48, '2018-05-02', '', ''),
(49, 2, 49, '2018-05-19', '', ''),
(50, 2, 50, '2018-05-19', '', ''),
(51, 1, 51, '2018-05-03', '', ''),
(52, 2, 52, '2018-05-04', '', ''),
(53, 2, 53, '2018-05-04', '', ''),
(54, 2, 54, '2018-05-04', '', ''),
(55, 2, 55, '2018-05-05', '', ''),
(56, 2, 56, '2018-05-04', '', ''),
(57, 2, 57, '2018-05-05', '', ''),
(58, 2, 58, '2018-05-05', '', ''),
(59, 2, 59, '2018-05-05', '', ''),
(60, 2, 60, '2018-05-05', '', ''),
(61, 2, 61, '2018-05-05', '', ''),
(62, 2, 62, '2018-05-05', '', ''),
(63, 2, 63, '2018-05-05', 'klklkljckjvkvjck', 'jkcjjck'),
(64, 2, 64, '2018-05-05', 'klklkljckjvkvjck', 'jkcjjck'),
(65, 2, 65, '2018-05-05', 'klklkljckjvkvjck', 'jkcjjck'),
(66, 2, 66, '2018-05-05', 'klklkljckjvkvjck', 'jkcjjck'),
(67, 2, 67, '2018-05-03', '', ''),
(68, 2, 24, '2018-06-08', '', ''),
(69, 2, 24, '2018-06-15', '', ''),
(70, 2, 27, '2018-06-01', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_carpeta_imputado`
--

CREATE TABLE `relacion_carpeta_imputado` (
  `id_relacion_c_i` int(15) NOT NULL,
  `fk_carpeta` int(15) NOT NULL,
  `fk_imputado` int(15) NOT NULL,
  `fk_datos_extra_i` int(15) DEFAULT NULL,
  `fk_procedimiento_abre` int(15) DEFAULT NULL,
  `fk_fecha_intermedia` int(15) DEFAULT NULL,
  `fk_fecha_2` int(15) DEFAULT NULL,
  `fk_fechas` int(15) DEFAULT NULL,
  `fk_termino` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_carpeta_imputado`
--

INSERT INTO `relacion_carpeta_imputado` (`id_relacion_c_i`, `fk_carpeta`, `fk_imputado`, `fk_datos_extra_i`, `fk_procedimiento_abre`, `fk_fecha_intermedia`, `fk_fecha_2`, `fk_fechas`, `fk_termino`) VALUES
(17, 24, 17, 22, 17, 29, 22, 17, 17),
(18, 25, 18, 23, 18, 30, 23, 18, 18),
(19, 26, 19, 24, 19, 31, 24, 19, 19),
(20, 27, 20, 25, 20, 34, 25, 20, 20),
(21, 28, 21, 26, 21, 40, 26, 21, 21),
(22, 29, 22, 27, 22, 41, 27, 22, 22),
(23, 30, 23, 28, 23, 42, 28, 23, 23),
(24, 31, 24, 29, 24, 43, 29, 24, 24),
(25, 32, 25, 30, 25, 44, 30, 25, 25),
(26, 33, 26, 31, 26, 45, 31, 26, 26),
(27, 34, 27, 32, 27, 46, 32, 27, 27),
(28, 35, 28, 33, 28, 47, 33, 28, 28),
(29, 36, 29, 34, 29, 48, 34, 29, 29),
(30, 37, 30, 35, 30, 49, 35, 30, 30),
(31, 38, 31, 36, 31, 50, 36, 31, 31),
(32, 39, 32, 37, 32, 51, 37, 32, 32),
(33, 40, 33, 38, 33, 52, 38, 33, 33),
(34, 41, 34, 39, 34, 53, 39, 34, 34),
(35, 42, 35, 40, 35, 54, 40, 35, 35),
(36, 43, 36, 41, 36, 55, 41, 36, 36),
(37, 44, 37, 42, 37, 56, 42, 37, 37),
(38, 45, 38, 43, 38, 57, 43, 38, 38),
(39, 46, 39, 44, 39, 58, 44, 39, 39),
(40, 47, 40, 45, 40, 59, 45, 40, 40),
(41, 48, 41, 46, 41, 60, 46, 41, 41),
(42, 49, 42, 47, 42, 61, 47, 42, 42),
(43, 50, 43, 48, 43, 62, 48, 43, 43),
(44, 54, 44, 52, 47, 66, 52, 47, 47),
(45, 56, 45, 54, 49, 68, 54, 49, 49),
(46, 57, 46, 55, 50, 69, 55, 50, 50),
(47, 58, 47, 56, 51, 70, 56, 51, 51),
(48, 59, 48, 57, 52, 71, 57, 52, 52),
(49, 60, 49, 58, 53, 72, 58, 53, 53),
(50, 61, 50, 59, 54, 73, 59, 54, 54),
(51, 62, 51, 60, 55, 74, 60, 55, 55),
(52, 63, 52, 61, 56, 75, 61, 56, 56),
(53, 64, 53, 62, 57, 76, 62, 57, 57),
(54, 65, 54, 63, 58, 77, 63, 58, 58),
(55, 66, 55, 64, 59, 78, 64, 59, 59),
(56, 67, 56, 65, 60, 79, 65, 60, 60);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_carpeta_juez`
--

CREATE TABLE `relacion_carpeta_juez` (
  `id_relacion_c_j` int(15) NOT NULL,
  `fk_carpeta` int(15) NOT NULL,
  `fk_nombre_juez_turno_control` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_carpeta_juez`
--

INSERT INTO `relacion_carpeta_juez` (`id_relacion_c_j`, `fk_carpeta`, `fk_nombre_juez_turno_control`) VALUES
(14, 24, 15),
(15, 25, 16),
(16, 26, 17),
(17, 27, 18),
(18, 28, 19),
(19, 29, 20),
(20, 30, 21),
(21, 31, 22),
(22, 32, 23),
(23, 33, 24),
(24, 34, 25),
(25, 35, 26),
(26, 36, 27),
(27, 37, 28),
(28, 38, 29),
(29, 39, 30),
(30, 40, 31),
(31, 41, 32),
(32, 42, 33),
(33, 43, 34),
(34, 44, 35),
(35, 45, 36),
(36, 46, 37),
(37, 47, 38),
(38, 48, 39),
(39, 49, 40),
(40, 50, 41),
(41, 51, 42),
(42, 52, 43),
(43, 53, 44),
(44, 54, 45),
(45, 55, 46),
(46, 56, 47),
(47, 57, 48),
(48, 58, 49),
(49, 59, 50),
(50, 60, 51),
(51, 61, 52),
(52, 62, 53),
(53, 63, 54),
(54, 64, 55),
(55, 65, 56),
(56, 66, 57),
(57, 67, 58);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_ve_i`
--

CREATE TABLE `relacion_ve_i` (
  `id_relacion_ve_i` int(15) NOT NULL,
  `fk_r_carpeta_i` int(15) NOT NULL,
  `fk_ve` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_victimae_carpeta`
--

CREATE TABLE `relacion_victimae_carpeta` (
  `id_relacion_vec` int(15) NOT NULL,
  `fk_ve` int(15) NOT NULL,
  `fk_carpeta` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_victimae_carpeta`
--

INSERT INTO `relacion_victimae_carpeta` (`id_relacion_vec`, `fk_ve`, `fk_carpeta`) VALUES
(17, 17, 24),
(18, 18, 25),
(19, 19, 26),
(20, 20, 27),
(21, 21, 28),
(22, 22, 29),
(23, 23, 30),
(24, 24, 31),
(25, 25, 32),
(26, 26, 33),
(27, 27, 34),
(28, 28, 35),
(29, 29, 36),
(30, 30, 37),
(31, 31, 38),
(32, 32, 39),
(33, 33, 40),
(34, 34, 41),
(35, 35, 42),
(36, 36, 43),
(37, 37, 44),
(38, 38, 45),
(39, 39, 46),
(40, 40, 47),
(41, 41, 48),
(42, 42, 49),
(43, 43, 50),
(44, 44, 54),
(45, 45, 56),
(46, 46, 57),
(47, 47, 58),
(48, 48, 59),
(49, 49, 60),
(50, 50, 61),
(51, 51, 62),
(52, 52, 63),
(53, 53, 64),
(54, 54, 65),
(55, 55, 66),
(56, 56, 67);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_victimam_carpeta`
--

CREATE TABLE `relacion_victimam_carpeta` (
  `id_relacionvmc` int(15) NOT NULL,
  `fk_relacion_carpeta` int(15) NOT NULL,
  `fk_vm` int(15) NOT NULL,
  `fk_datos_v` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_victimam_carpeta`
--

INSERT INTO `relacion_victimam_carpeta` (`id_relacionvmc`, `fk_relacion_carpeta`, `fk_vm`, `fk_datos_v`) VALUES
(4, 24, 17, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_victima_carpeta`
--

CREATE TABLE `relacion_victima_carpeta` (
  `id_relacionvc` int(15) NOT NULL,
  `fk_victima` int(15) NOT NULL,
  `fk_carpeta` int(15) NOT NULL,
  `fk_datos_v` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relacion_victima_carpeta`
--

INSERT INTO `relacion_victima_carpeta` (`id_relacionvc`, `fk_victima`, `fk_carpeta`, `fk_datos_v`) VALUES
(6, 17, 24, 13),
(7, 18, 25, 14),
(8, 19, 26, 15),
(9, 20, 27, 16),
(10, 21, 28, 17),
(11, 22, 29, 18),
(12, 23, 30, 19),
(13, 24, 31, 20),
(14, 25, 32, 21),
(15, 26, 33, 22),
(16, 27, 34, 23),
(17, 28, 35, 24),
(18, 29, 36, 25),
(19, 30, 37, 26),
(20, 31, 38, 27),
(21, 32, 39, 28),
(22, 33, 40, 29),
(23, 34, 41, 30),
(24, 35, 42, 31),
(25, 36, 43, 32),
(26, 37, 44, 33),
(27, 38, 45, 34),
(28, 39, 46, 35),
(29, 40, 47, 36),
(30, 41, 48, 37),
(31, 42, 49, 38),
(32, 43, 50, 39),
(33, 44, 54, 40),
(34, 45, 56, 41),
(35, 46, 57, 42),
(36, 47, 58, 43),
(37, 48, 59, 44),
(38, 49, 60, 45),
(39, 50, 61, 46),
(40, 51, 62, 47),
(41, 52, 63, 48),
(42, 53, 64, 49),
(43, 54, 65, 50),
(44, 55, 66, 51),
(45, 56, 67, 52);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_vm_i`
--

CREATE TABLE `relacion_vm_i` (
  `id_relacion_vm_i` int(11) NOT NULL,
  `fk_r_carpeta_i` int(15) NOT NULL,
  `fk_vm` int(15) NOT NULL,
  `fk_datos_v` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacion_v_i`
--

CREATE TABLE `relacion_v_i` (
  `id_relacion_v_i` int(15) NOT NULL,
  `fk_r_carpeta_i` int(15) NOT NULL,
  `fk_victima` int(15) NOT NULL,
  `fk_datos_v` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparacion_del_daño`
--

CREATE TABLE `reparacion_del_daño` (
  `id_reparacion_daño` int(15) NOT NULL,
  `opciones` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reparacion_del_daño`
--

INSERT INTO `reparacion_del_daño` (`id_reparacion_daño`, `opciones`) VALUES
(1, 'Satisfecha'),
(2, 'No aplica'),
(3, 'Se condena');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resolucion_apelacion_mp`
--

CREATE TABLE `resolucion_apelacion_mp` (
  `id_resolucion` int(15) NOT NULL,
  `opciones` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `resolucion_apelacion_mp`
--

INSERT INTO `resolucion_apelacion_mp` (`id_resolucion`, `opciones`) VALUES
(1, 'Confirma'),
(2, 'Modifica'),
(3, 'Revoca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seconsede_opciones`
--

CREATE TABLE `seconsede_opciones` (
  `id_opciones` int(15) NOT NULL,
  `opciones` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `seconsede_opciones`
--

INSERT INTO `seconsede_opciones` (`id_opciones`, `opciones`) VALUES
(1, 'Se niega'),
(2, 'Se concede');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE `sexo` (
  `id_sexo` int(2) NOT NULL,
  `opciones` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sexo`
--

INSERT INTO `sexo` (`id_sexo`, `opciones`) VALUES
(1, 'Femenino'),
(2, 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sise_consede_opciones_si`
--

CREATE TABLE `sise_consede_opciones_si` (
  `id_se_consede` int(15) NOT NULL,
  `opciones` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sise_consede_opciones_si`
--

INSERT INTO `sise_consede_opciones_si` (`id_se_consede`, `opciones`) VALUES
(1, 'checar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `soluciones_alternas`
--

CREATE TABLE `soluciones_alternas` (
  `id_soluciones_al` int(15) NOT NULL,
  `acuerdo_reparatorio` date DEFAULT NULL,
  `suspencion_condicional` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `soluciones_alternas`
--

INSERT INTO `soluciones_alternas` (`id_soluciones_al`, `acuerdo_reparatorio`, `suspencion_condicional`) VALUES
(17, '2018-06-15', '2018-06-15'),
(18, NULL, NULL),
(19, NULL, NULL),
(20, NULL, NULL),
(21, NULL, NULL),
(22, NULL, NULL),
(23, NULL, NULL),
(24, NULL, NULL),
(25, NULL, NULL),
(26, NULL, NULL),
(27, NULL, NULL),
(28, NULL, NULL),
(29, NULL, NULL),
(30, NULL, NULL),
(31, NULL, NULL),
(32, NULL, NULL),
(33, NULL, NULL),
(34, NULL, NULL),
(35, NULL, NULL),
(36, NULL, NULL),
(37, NULL, NULL),
(38, NULL, NULL),
(39, NULL, NULL),
(40, NULL, NULL),
(41, NULL, NULL),
(42, NULL, NULL),
(43, NULL, NULL),
(44, NULL, NULL),
(45, NULL, NULL),
(46, NULL, NULL),
(47, NULL, NULL),
(48, NULL, NULL),
(49, NULL, NULL),
(50, NULL, NULL),
(51, NULL, NULL),
(52, NULL, NULL),
(53, NULL, NULL),
(54, NULL, NULL),
(55, NULL, NULL),
(56, NULL, NULL),
(57, NULL, NULL),
(58, NULL, NULL),
(59, NULL, NULL),
(60, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `termino`
--

CREATE TABLE `termino` (
  `id_termino` int(15) NOT NULL,
  `puntos_resolutivos_sentencia` varchar(350) DEFAULT NULL,
  `fecha_recurso_impuesto` varchar(250) DEFAULT NULL,
  `fk_resolucion` int(15) DEFAULT NULL,
  `tribunal_juicio_oral` varchar(250) DEFAULT NULL,
  `carpeta_ejecucion` varchar(40) DEFAULT NULL,
  `fecha_envio_fiscalia_ejecucion` varchar(25) DEFAULT NULL,
  `fecha_audiencia_ejecucion` date DEFAULT NULL,
  `fk_seconcede_niega` int(15) DEFAULT NULL,
  `fk_consede_niega` int(15) DEFAULT NULL,
  `tipo_de_beneficio_concedido` varchar(50) DEFAULT NULL,
  `resolucion_ejecucion` varchar(250) DEFAULT NULL,
  `fk_estado_actual_carapeta` int(15) DEFAULT NULL,
  `fecha_asunto_concluido` date DEFAULT NULL,
  `fecha_remitida_sentencia` date DEFAULT NULL,
  `fecha_abreviado_condenatorio` date DEFAULT NULL,
  `fecha_audiencia` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `termino`
--

INSERT INTO `termino` (`id_termino`, `puntos_resolutivos_sentencia`, `fecha_recurso_impuesto`, `fk_resolucion`, `tribunal_juicio_oral`, `carpeta_ejecucion`, `fecha_envio_fiscalia_ejecucion`, `fecha_audiencia_ejecucion`, `fk_seconcede_niega`, `fk_consede_niega`, `tipo_de_beneficio_concedido`, `resolucion_ejecucion`, `fk_estado_actual_carapeta`, `fecha_asunto_concluido`, `fecha_remitida_sentencia`, `fecha_abreviado_condenatorio`, `fecha_audiencia`) VALUES
(17, 'yom', 'yooo', 1, 'nos', 'aaa', 'nose', '2018-06-15', 1, 1, 'exis', 'mmm', 2, '2018-06-15', '2018-06-15', '2018-06-15', '2018-06-15'),
(18, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(19, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(20, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(21, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(22, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(23, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(24, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(25, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(26, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(27, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(28, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(29, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(30, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(31, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(32, '', '', NULL, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(33, '', '', NULL, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(34, '', '', 1, '', '', '', NULL, 2, 1, '', '', 2, NULL, NULL, NULL, NULL),
(35, '', '', 1, '', '', '', NULL, 2, 1, '', '', 2, NULL, NULL, NULL, NULL),
(36, '', '', 1, '', '', '', NULL, 2, 1, '', '', 2, NULL, NULL, NULL, NULL),
(37, '', '', 1, '', '', '', NULL, 2, 1, '', '', 2, NULL, NULL, NULL, NULL),
(38, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(39, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(40, '', '', 1, '', '', '', NULL, 1, 1, '', '', 2, NULL, NULL, NULL, NULL),
(41, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', 2, NULL, NULL, NULL, NULL),
(42, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', 2, NULL, NULL, NULL, NULL),
(43, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', 2, NULL, NULL, NULL, NULL),
(44, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(45, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(46, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(47, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(48, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(49, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(50, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL),
(51, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, '2018-05-09'),
(52, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, '2018-05-09'),
(53, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, '2018-05-09'),
(54, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, '2018-05-09'),
(55, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, '2018-05-24', '2018-05-30', '2018-05-09'),
(56, 'ccc', '  xx', 2, '', '', '', NULL, NULL, NULL, '', '', 4, '2018-05-25', '2018-05-24', '2018-05-30', '2018-05-09'),
(57, 'ccc', '  xx', 2, 'jkjckcjkjk', 'jkj', 'kj', '2018-05-23', 2, 1, 'jcjcjc', 'jjcjc', 4, '2018-05-25', '2018-05-24', '2018-05-30', '2018-05-09'),
(58, 'ccc', '  xx', 2, 'jkjckcjkjk', 'jkj', 'kj', '2018-05-23', 2, 1, 'jcjcjc', 'jjcjc', 4, '2018-05-25', '2018-05-24', '2018-05-30', '2018-05-09'),
(59, 'ccc', '  xx', 2, 'jkjckcjkjk', 'jkj', 'kj', '2018-05-23', 2, 1, 'jcjcjc', 'jjcjc', 4, '2018-05-25', '2018-05-24', '2018-05-30', '2018-05-09'),
(60, '', '', NULL, '', '', '', NULL, NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_fallo`
--

CREATE TABLE `tipo_de_fallo` (
  `id_tipo_de_fallo` int(3) NOT NULL,
  `opciones` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_de_fallo`
--

INSERT INTO `tipo_de_fallo` (`id_tipo_de_fallo`, `opciones`) VALUES
(1, 'Condenatorio'),
(2, 'Absolutorio'),
(3, 'Mixto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidad_de_gestion`
--

CREATE TABLE `unidad_de_gestion` (
  `id_unidad_gestion` int(11) NOT NULL,
  `opciones` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `unidad_de_gestion`
--

INSERT INTO `unidad_de_gestion` (`id_unidad_gestion`, `opciones`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codigo_u` int(20) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `clave` varchar(70) NOT NULL,
  `tipo` enum('A','O','S') NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `p_codigo` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codigo_u`, `usuario`, `clave`, `tipo`, `estado`, `p_codigo`) VALUES
(2, 'ana', '904294d8c54b1c63e40832fa1d95bcde534b310df6d42882ce4baf28f3e0184a', 'A', 1, 2),
(4, 'karen', '1234', 'A', 1, 4),
(15, 'andy', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'O', 1, 15),
(16, 'andres', '7a5df5ffa0dec2228d90b8d0a0f1b0767b748b0a41314c123075b8289e4e053f', 'A', 1, 16),
(17, 'ana', '6b51d431df5d7f141cbececcf79edf3dd861c3b4069f0b11661a3eefacbba918', 'A', 1, 17),
(18, 'andree', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'A', 1, 18),
(19, 'aoa', '6b51d431df5d7f141cbececcf79edf3dd861c3b4069f0b11661a3eefacbba918', 'O', 1, 19),
(20, 'lulu', '4a44dc15364204a80fe80e9039455cc1608281820fe2b24f1e5233ade6af1dd5', 'O', 1, 20),
(21, 'canelito', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 'A', 1, 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vempresaorg`
--

CREATE TABLE `vempresaorg` (
  `id_veorg` int(15) NOT NULL,
  `nombre` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vempresaorg`
--

INSERT INTO `vempresaorg` (`id_veorg`, `nombre`) VALUES
(17, ''),
(18, ''),
(19, ''),
(20, ''),
(21, ''),
(22, ''),
(23, ''),
(24, ''),
(25, ''),
(26, ''),
(27, ''),
(28, ''),
(29, ''),
(30, ''),
(31, ''),
(32, ''),
(33, ''),
(34, ''),
(35, ''),
(36, ''),
(37, ''),
(38, ''),
(39, ''),
(40, ''),
(41, ''),
(42, ''),
(43, ''),
(44, ''),
(45, ''),
(46, ''),
(47, 'cjcjc'),
(48, 'cjcjc'),
(49, 'cjcjc'),
(50, 'cjcjc'),
(51, 'cjcjc'),
(52, 'cjcjc'),
(53, 'cjcjc'),
(54, 'cjcjc'),
(55, 'cjcjc'),
(56, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `victima_p`
--

CREATE TABLE `victima_p` (
  `id_victima_p` int(15) NOT NULL,
  `nomre` varchar(40) DEFAULT NULL,
  `apellido_p` varchar(40) DEFAULT NULL,
  `apellido_m` varchar(40) DEFAULT NULL,
  `alias` varchar(200) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `fk_sexo` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `victima_p`
--

INSERT INTO `victima_p` (`id_victima_p`, `nomre`, `apellido_p`, `apellido_m`, `alias`, `nacionalidad`, `fk_sexo`) VALUES
(17, '', '', '', '', '', 1),
(18, '', '', '', '', '', 1),
(19, '', '', '', '', '', 1),
(20, '', '', '', '', '', 1),
(21, '', '', '', '', '', 1),
(22, '', '', '', '', '', 1),
(23, '', '', '', '', '', 1),
(24, '', '', '', '', '', 1),
(25, '', '', '', '', '', 1),
(26, '', '', '', '', '', 1),
(27, '', '', '', '', '', 1),
(28, '', '', '', '', '', 1),
(29, '', '', '', '', '', 1),
(30, '', '', '', '', '', 1),
(31, '', '', '', '', '', 1),
(32, '', '', '', '', '', 1),
(33, '', '', '', '', '', 1),
(34, '', '', '', '', '', 1),
(35, '', '', '', '', '', 1),
(36, '', '', '', '', '', 1),
(37, '', '', '', '', '', 1),
(38, '', '', '', '', '', 1),
(39, '', '', '', '', '', 1),
(40, '', '', '', '', '', 1),
(41, '', '', '', '', '', 1),
(42, '', '', '', '', '', 1),
(43, '', '', '', '', '', 1),
(44, '', '', '', '', '', 2),
(45, '', '', '', '', '', NULL),
(46, '', '', '', '', '', NULL),
(47, '', '', '', '', '', NULL),
(48, '', '', '', '', '', 1),
(49, '', '', 'j kxcjk', '', '', 1),
(50, '', '', 'j kxcjk', '', '', 1),
(51, '', '', 'j kxcjk', '', '', 1),
(52, '', '', 'j kxcjk', '', '', 1),
(53, '', '', 'j kxcjk', '', '', 1),
(54, '', '', 'j kxcjk', '', '', 1),
(55, '', '', 'j kxcjk', '', '', 1),
(56, '', '', '', '', '', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `v_menor`
--

CREATE TABLE `v_menor` (
  `id_v_menor` int(15) NOT NULL,
  `iniciales` varchar(10) DEFAULT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `fk_sexo` int(2) DEFAULT NULL,
  `observaciones_v_menor` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `v_menor`
--

INSERT INTO `v_menor` (`id_v_menor`, `iniciales`, `nombre`, `nacionalidad`, `fk_sexo`, `observaciones_v_menor`) VALUES
(17, '', '', '', 1, ''),
(18, '', '', '', 1, ''),
(19, '', '', '', 1, ''),
(20, '', '', '', 1, ''),
(21, '', '', '', 1, ''),
(22, '', '', '', 1, ''),
(23, '', '', '', 1, ''),
(24, '', '', '', 1, ''),
(25, '', '', '', 1, ''),
(26, '', '', '', 1, ''),
(27, '', '', '', 1, ''),
(28, '', '', '', 1, ''),
(29, '', '', '', 1, ''),
(30, '', '', '', 1, ''),
(31, '', '', '', 1, ''),
(32, '', '', '', 1, ''),
(33, '', '', '', 1, ''),
(34, '', '', '', 1, ''),
(35, '', '', '', 1, ''),
(36, '', '', '', 1, ''),
(37, '', '', '', 1, ''),
(38, '', '', '', 1, ''),
(39, '', '', '', 1, ''),
(40, '', '', '', 1, ''),
(41, '', '', '', 1, ''),
(42, '', '', '', 1, ''),
(43, '', '', '', 1, ''),
(44, '', '', '', 2, ''),
(45, '', '', '', NULL, ''),
(46, '', '', '', NULL, ''),
(47, 'k', 'jkjkj', 'jkjkj', NULL, 'jkjk'),
(48, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(49, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(50, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(51, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(52, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(53, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(54, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(55, 'k', 'jkjkj', 'jkjkj', 1, 'jkjk'),
(56, '', '', '', NULL, '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `abogado`
--
ALTER TABLE `abogado`
  ADD PRIMARY KEY (`id_abogado`);

--
-- Indices de la tabla `calificacion_d_h`
--
ALTER TABLE `calificacion_d_h`
  ADD PRIMARY KEY (`id_calificacion_dh`);

--
-- Indices de la tabla `carpeta`
--
ALTER TABLE `carpeta`
  ADD PRIMARY KEY (`id_carpeta`),
  ADD KEY `fk_csd` (`fk_csd`),
  ADD KEY `fk_puesta_disposicion` (`fk_puesta_disposicion`),
  ADD KEY `fk_procedencia` (`fk_procedencia`),
  ADD KEY `fk_m_p_trabaja` (`fk_m_p_trabaja`),
  ADD KEY `fk_unidad_gestion` (`fk_unidad_gestion`);

--
-- Indices de la tabla `combo_c_s_d`
--
ALTER TABLE `combo_c_s_d`
  ADD PRIMARY KEY (`id_csd`);

--
-- Indices de la tabla `datos_espesificos_de_imputado`
--
ALTER TABLE `datos_espesificos_de_imputado`
  ADD PRIMARY KEY (`id_detos_extra`),
  ADD KEY `fk_calificacion_dh` (`fk_calificacion_dh`),
  ADD KEY `fk_abogado` (`fk_abogado`);

--
-- Indices de la tabla `datos_espesificos_v`
--
ALTER TABLE `datos_espesificos_v`
  ADD PRIMARY KEY (`id_datos_espesificos_v`);

--
-- Indices de la tabla `estado_actual_de_carpeta`
--
ALTER TABLE `estado_actual_de_carpeta`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indices de la tabla `etapa_intermedia`
--
ALTER TABLE `etapa_intermedia`
  ADD PRIMARY KEY (`id_etapa_intermedia`);

--
-- Indices de la tabla `fechas`
--
ALTER TABLE `fechas`
  ADD PRIMARY KEY (`id_fechas`),
  ADD KEY `fk_soluciones_alternas` (`fk_soluciones_alternas`);

--
-- Indices de la tabla `fecha_2`
--
ALTER TABLE `fecha_2`
  ADD PRIMARY KEY (`id_fecha2`);

--
-- Indices de la tabla `fecha_audiencia`
--
ALTER TABLE `fecha_audiencia`
  ADD PRIMARY KEY (`id_fecha_audiencia`);

--
-- Indices de la tabla `fecha_intermedia`
--
ALTER TABLE `fecha_intermedia`
  ADD PRIMARY KEY (`id_fecha_intermedia`),
  ADD KEY `fk_etapa_intermedia` (`fk_etapa_intermedia`),
  ADD KEY `fk_tipo_de_fallo` (`fk_tipo_de_fallo`),
  ADD KEY `fk_pena` (`fk_pena`);

--
-- Indices de la tabla `hidtoria_carpeta`
--
ALTER TABLE `hidtoria_carpeta`
  ADD PRIMARY KEY (`idhistoria`);

--
-- Indices de la tabla `imputado`
--
ALTER TABLE `imputado`
  ADD PRIMARY KEY (`id_imputado`),
  ADD KEY `fk_sexo` (`fk_sexo`);

--
-- Indices de la tabla `juez_de_tuno_control_nombre`
--
ALTER TABLE `juez_de_tuno_control_nombre`
  ADD PRIMARY KEY (`id_nombre_juez_control_turno`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_submenu` (`codigo_submenu`);

--
-- Indices de la tabla `modifica_carpeta_usuario`
--
ALTER TABLE `modifica_carpeta_usuario`
  ADD PRIMARY KEY (`id_modifica`),
  ADD KEY `fk_carpeta` (`fk_carpeta`),
  ADD KEY `fk_persona` (`fk_persona`);

--
-- Indices de la tabla `mp_que_trabaja`
--
ALTER TABLE `mp_que_trabaja`
  ADD PRIMARY KEY (`id_mp_trabaja`);

--
-- Indices de la tabla `pena`
--
ALTER TABLE `pena`
  ADD PRIMARY KEY (`id_pena`),
  ADD KEY `fk_reparacion_daño` (`fk_reparacion_daño`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`codigo_p`),
  ADD KEY `codigo_p` (`codigo_p`);

--
-- Indices de la tabla `procedencia`
--
ALTER TABLE `procedencia`
  ADD PRIMARY KEY (`id_procedencia`);

--
-- Indices de la tabla `procedimiento_abreviado`
--
ALTER TABLE `procedimiento_abreviado`
  ADD PRIMARY KEY (`id_procedimiento_abr`);

--
-- Indices de la tabla `procedi_abreviado_t`
--
ALTER TABLE `procedi_abreviado_t`
  ADD PRIMARY KEY (`id_procedimiento`),
  ADD KEY `fk_procedimiento_op` (`fk_procedimiento_op`),
  ADD KEY `fk_tipode_fallo` (`fk_tipode_fallo`);

--
-- Indices de la tabla `puesta_a_disposicion`
--
ALTER TABLE `puesta_a_disposicion`
  ADD PRIMARY KEY (`id_puesta_disp`);

--
-- Indices de la tabla `relacion_carpeta_historia`
--
ALTER TABLE `relacion_carpeta_historia`
  ADD PRIMARY KEY (`idrelacioncarphis`),
  ADD KEY `fk_historia_op` (`fk_historia_op`),
  ADD KEY `fk_carpeta` (`fk_carpeta`);

--
-- Indices de la tabla `relacion_carpeta_imputado`
--
ALTER TABLE `relacion_carpeta_imputado`
  ADD PRIMARY KEY (`id_relacion_c_i`),
  ADD KEY `fk_carpeta` (`fk_carpeta`),
  ADD KEY `fk_imputado` (`fk_imputado`),
  ADD KEY `fk_datos_extra_i` (`fk_datos_extra_i`),
  ADD KEY `fk_procedimiento_abre` (`fk_procedimiento_abre`),
  ADD KEY `fk_fecha_intermedia` (`fk_fecha_intermedia`),
  ADD KEY `fk_fecha_2` (`fk_fecha_2`),
  ADD KEY `fk_fechas` (`fk_fechas`),
  ADD KEY `fk_termino` (`fk_termino`);

--
-- Indices de la tabla `relacion_carpeta_juez`
--
ALTER TABLE `relacion_carpeta_juez`
  ADD PRIMARY KEY (`id_relacion_c_j`),
  ADD KEY `fk_carpeta` (`fk_carpeta`),
  ADD KEY `fk_nombre_juez_turno_control` (`fk_nombre_juez_turno_control`);

--
-- Indices de la tabla `relacion_ve_i`
--
ALTER TABLE `relacion_ve_i`
  ADD PRIMARY KEY (`id_relacion_ve_i`),
  ADD KEY `fk_r_carpeta_i` (`fk_r_carpeta_i`),
  ADD KEY `fk_ve` (`fk_ve`);

--
-- Indices de la tabla `relacion_victimae_carpeta`
--
ALTER TABLE `relacion_victimae_carpeta`
  ADD PRIMARY KEY (`id_relacion_vec`),
  ADD KEY `fk_ve` (`fk_ve`),
  ADD KEY `fk_carpeta` (`fk_carpeta`);

--
-- Indices de la tabla `relacion_victimam_carpeta`
--
ALTER TABLE `relacion_victimam_carpeta`
  ADD PRIMARY KEY (`id_relacionvmc`),
  ADD KEY `fk_relacion_carpeta` (`fk_relacion_carpeta`),
  ADD KEY `fk_vm` (`fk_vm`),
  ADD KEY `fk_datos_v` (`fk_datos_v`),
  ADD KEY `fk_datos_v_2` (`fk_datos_v`);

--
-- Indices de la tabla `relacion_victima_carpeta`
--
ALTER TABLE `relacion_victima_carpeta`
  ADD PRIMARY KEY (`id_relacionvc`),
  ADD KEY `fk_victima` (`fk_victima`),
  ADD KEY `fk_carpeta` (`fk_carpeta`),
  ADD KEY `fk_datos_v` (`fk_datos_v`),
  ADD KEY `fk_datos_v_2` (`fk_datos_v`);

--
-- Indices de la tabla `relacion_vm_i`
--
ALTER TABLE `relacion_vm_i`
  ADD PRIMARY KEY (`id_relacion_vm_i`),
  ADD KEY `fk_datos_v` (`fk_datos_v`),
  ADD KEY `fk_vm` (`fk_vm`),
  ADD KEY `fk_r_carpeta_i` (`fk_r_carpeta_i`);

--
-- Indices de la tabla `relacion_v_i`
--
ALTER TABLE `relacion_v_i`
  ADD PRIMARY KEY (`id_relacion_v_i`),
  ADD KEY `fk_datos_v` (`fk_datos_v`),
  ADD KEY `fk_victima` (`fk_victima`),
  ADD KEY `fk_r_carpeta_i` (`fk_r_carpeta_i`);

--
-- Indices de la tabla `reparacion_del_daño`
--
ALTER TABLE `reparacion_del_daño`
  ADD PRIMARY KEY (`id_reparacion_daño`);

--
-- Indices de la tabla `resolucion_apelacion_mp`
--
ALTER TABLE `resolucion_apelacion_mp`
  ADD PRIMARY KEY (`id_resolucion`);

--
-- Indices de la tabla `seconsede_opciones`
--
ALTER TABLE `seconsede_opciones`
  ADD PRIMARY KEY (`id_opciones`);

--
-- Indices de la tabla `sexo`
--
ALTER TABLE `sexo`
  ADD PRIMARY KEY (`id_sexo`);

--
-- Indices de la tabla `sise_consede_opciones_si`
--
ALTER TABLE `sise_consede_opciones_si`
  ADD PRIMARY KEY (`id_se_consede`);

--
-- Indices de la tabla `soluciones_alternas`
--
ALTER TABLE `soluciones_alternas`
  ADD PRIMARY KEY (`id_soluciones_al`);

--
-- Indices de la tabla `termino`
--
ALTER TABLE `termino`
  ADD PRIMARY KEY (`id_termino`),
  ADD KEY `fk_resolucion` (`fk_resolucion`),
  ADD KEY `fk_seconcede_niega` (`fk_seconcede_niega`),
  ADD KEY `fk_consede_niega` (`fk_consede_niega`),
  ADD KEY `fk_estado_actual_carapeta` (`fk_estado_actual_carapeta`);

--
-- Indices de la tabla `tipo_de_fallo`
--
ALTER TABLE `tipo_de_fallo`
  ADD PRIMARY KEY (`id_tipo_de_fallo`);

--
-- Indices de la tabla `unidad_de_gestion`
--
ALTER TABLE `unidad_de_gestion`
  ADD PRIMARY KEY (`id_unidad_gestion`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo_u`),
  ADD KEY `p_codigo` (`p_codigo`);

--
-- Indices de la tabla `vempresaorg`
--
ALTER TABLE `vempresaorg`
  ADD PRIMARY KEY (`id_veorg`);

--
-- Indices de la tabla `victima_p`
--
ALTER TABLE `victima_p`
  ADD PRIMARY KEY (`id_victima_p`),
  ADD KEY `fk_sexo` (`fk_sexo`);

--
-- Indices de la tabla `v_menor`
--
ALTER TABLE `v_menor`
  ADD PRIMARY KEY (`id_v_menor`),
  ADD KEY `fk_sexo` (`fk_sexo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `abogado`
--
ALTER TABLE `abogado`
  MODIFY `id_abogado` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `calificacion_d_h`
--
ALTER TABLE `calificacion_d_h`
  MODIFY `id_calificacion_dh` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `carpeta`
--
ALTER TABLE `carpeta`
  MODIFY `id_carpeta` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
--
-- AUTO_INCREMENT de la tabla `combo_c_s_d`
--
ALTER TABLE `combo_c_s_d`
  MODIFY `id_csd` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `datos_espesificos_de_imputado`
--
ALTER TABLE `datos_espesificos_de_imputado`
  MODIFY `id_detos_extra` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
--
-- AUTO_INCREMENT de la tabla `datos_espesificos_v`
--
ALTER TABLE `datos_espesificos_v`
  MODIFY `id_datos_espesificos_v` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
--
-- AUTO_INCREMENT de la tabla `estado_actual_de_carpeta`
--
ALTER TABLE `estado_actual_de_carpeta`
  MODIFY `id_estado` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `etapa_intermedia`
--
ALTER TABLE `etapa_intermedia`
  MODIFY `id_etapa_intermedia` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `fechas`
--
ALTER TABLE `fechas`
  MODIFY `id_fechas` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;
--
-- AUTO_INCREMENT de la tabla `fecha_2`
--
ALTER TABLE `fecha_2`
  MODIFY `id_fecha2` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
--
-- AUTO_INCREMENT de la tabla `fecha_audiencia`
--
ALTER TABLE `fecha_audiencia`
  MODIFY `id_fecha_audiencia` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `fecha_intermedia`
--
ALTER TABLE `fecha_intermedia`
  MODIFY `id_fecha_intermedia` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;
--
-- AUTO_INCREMENT de la tabla `hidtoria_carpeta`
--
ALTER TABLE `hidtoria_carpeta`
  MODIFY `idhistoria` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `imputado`
--
ALTER TABLE `imputado`
  MODIFY `id_imputado` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `juez_de_tuno_control_nombre`
--
ALTER TABLE `juez_de_tuno_control_nombre`
  MODIFY `id_nombre_juez_control_turno` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `codigo` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT de la tabla `modifica_carpeta_usuario`
--
ALTER TABLE `modifica_carpeta_usuario`
  MODIFY `id_modifica` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mp_que_trabaja`
--
ALTER TABLE `mp_que_trabaja`
  MODIFY `id_mp_trabaja` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de la tabla `pena`
--
ALTER TABLE `pena`
  MODIFY `id_pena` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `codigo_p` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `procedencia`
--
ALTER TABLE `procedencia`
  MODIFY `id_procedencia` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT de la tabla `procedi_abreviado_t`
--
ALTER TABLE `procedi_abreviado_t`
  MODIFY `id_procedimiento` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;
--
-- AUTO_INCREMENT de la tabla `puesta_a_disposicion`
--
ALTER TABLE `puesta_a_disposicion`
  MODIFY `id_puesta_disp` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `relacion_carpeta_historia`
--
ALTER TABLE `relacion_carpeta_historia`
  MODIFY `idrelacioncarphis` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT de la tabla `relacion_carpeta_imputado`
--
ALTER TABLE `relacion_carpeta_imputado`
  MODIFY `id_relacion_c_i` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `relacion_carpeta_juez`
--
ALTER TABLE `relacion_carpeta_juez`
  MODIFY `id_relacion_c_j` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;
--
-- AUTO_INCREMENT de la tabla `relacion_ve_i`
--
ALTER TABLE `relacion_ve_i`
  MODIFY `id_relacion_ve_i` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `relacion_victimae_carpeta`
--
ALTER TABLE `relacion_victimae_carpeta`
  MODIFY `id_relacion_vec` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `relacion_victimam_carpeta`
--
ALTER TABLE `relacion_victimam_carpeta`
  MODIFY `id_relacionvmc` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `relacion_victima_carpeta`
--
ALTER TABLE `relacion_victima_carpeta`
  MODIFY `id_relacionvc` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
--
-- AUTO_INCREMENT de la tabla `relacion_vm_i`
--
ALTER TABLE `relacion_vm_i`
  MODIFY `id_relacion_vm_i` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `relacion_v_i`
--
ALTER TABLE `relacion_v_i`
  MODIFY `id_relacion_v_i` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `reparacion_del_daño`
--
ALTER TABLE `reparacion_del_daño`
  MODIFY `id_reparacion_daño` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `resolucion_apelacion_mp`
--
ALTER TABLE `resolucion_apelacion_mp`
  MODIFY `id_resolucion` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `seconsede_opciones`
--
ALTER TABLE `seconsede_opciones`
  MODIFY `id_opciones` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `sexo`
--
ALTER TABLE `sexo`
  MODIFY `id_sexo` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `sise_consede_opciones_si`
--
ALTER TABLE `sise_consede_opciones_si`
  MODIFY `id_se_consede` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `soluciones_alternas`
--
ALTER TABLE `soluciones_alternas`
  MODIFY `id_soluciones_al` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;
--
-- AUTO_INCREMENT de la tabla `termino`
--
ALTER TABLE `termino`
  MODIFY `id_termino` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;
--
-- AUTO_INCREMENT de la tabla `tipo_de_fallo`
--
ALTER TABLE `tipo_de_fallo`
  MODIFY `id_tipo_de_fallo` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `unidad_de_gestion`
--
ALTER TABLE `unidad_de_gestion`
  MODIFY `id_unidad_gestion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_u` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `vempresaorg`
--
ALTER TABLE `vempresaorg`
  MODIFY `id_veorg` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `victima_p`
--
ALTER TABLE `victima_p`
  MODIFY `id_victima_p` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `v_menor`
--
ALTER TABLE `v_menor`
  MODIFY `id_v_menor` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carpeta`
--
ALTER TABLE `carpeta`
  ADD CONSTRAINT `carpeta_ibfk_1` FOREIGN KEY (`fk_m_p_trabaja`) REFERENCES `mp_que_trabaja` (`id_mp_trabaja`) ON UPDATE CASCADE,
  ADD CONSTRAINT `carpeta_ibfk_2` FOREIGN KEY (`fk_unidad_gestion`) REFERENCES `unidad_de_gestion` (`id_unidad_gestion`) ON UPDATE CASCADE,
  ADD CONSTRAINT `carpeta_ibfk_3` FOREIGN KEY (`fk_puesta_disposicion`) REFERENCES `puesta_a_disposicion` (`id_puesta_disp`) ON UPDATE CASCADE,
  ADD CONSTRAINT `carpeta_ibfk_4` FOREIGN KEY (`fk_procedencia`) REFERENCES `procedencia` (`id_procedencia`) ON UPDATE CASCADE,
  ADD CONSTRAINT `carpeta_ibfk_5` FOREIGN KEY (`fk_csd`) REFERENCES `combo_c_s_d` (`id_csd`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `datos_espesificos_de_imputado`
--
ALTER TABLE `datos_espesificos_de_imputado`
  ADD CONSTRAINT `datos_espesificos_de_imputado_ibfk_1` FOREIGN KEY (`fk_abogado`) REFERENCES `abogado` (`id_abogado`) ON UPDATE CASCADE,
  ADD CONSTRAINT `datos_espesificos_de_imputado_ibfk_2` FOREIGN KEY (`fk_calificacion_dh`) REFERENCES `calificacion_d_h` (`id_calificacion_dh`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `fechas`
--
ALTER TABLE `fechas`
  ADD CONSTRAINT `fechas_ibfk_1` FOREIGN KEY (`fk_soluciones_alternas`) REFERENCES `soluciones_alternas` (`id_soluciones_al`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `fecha_intermedia`
--
ALTER TABLE `fecha_intermedia`
  ADD CONSTRAINT `fecha_intermedia_ibfk_1` FOREIGN KEY (`fk_pena`) REFERENCES `pena` (`id_pena`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fecha_intermedia_ibfk_2` FOREIGN KEY (`fk_tipo_de_fallo`) REFERENCES `tipo_de_fallo` (`id_tipo_de_fallo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fecha_intermedia_ibfk_3` FOREIGN KEY (`fk_etapa_intermedia`) REFERENCES `etapa_intermedia` (`id_etapa_intermedia`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `imputado`
--
ALTER TABLE `imputado`
  ADD CONSTRAINT `imputado_ibfk_1` FOREIGN KEY (`fk_sexo`) REFERENCES `sexo` (`id_sexo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`codigo_submenu`) REFERENCES `menu` (`codigo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `modifica_carpeta_usuario`
--
ALTER TABLE `modifica_carpeta_usuario`
  ADD CONSTRAINT `modifica_carpeta_usuario_ibfk_2` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `modifica_carpeta_usuario_ibfk_3` FOREIGN KEY (`fk_persona`) REFERENCES `persona` (`codigo_p`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `pena`
--
ALTER TABLE `pena`
  ADD CONSTRAINT `pena_ibfk_1` FOREIGN KEY (`fk_reparacion_daño`) REFERENCES `reparacion_del_daño` (`id_reparacion_daño`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `procedi_abreviado_t`
--
ALTER TABLE `procedi_abreviado_t`
  ADD CONSTRAINT `procedi_abreviado_t_ibfk_1` FOREIGN KEY (`fk_procedimiento_op`) REFERENCES `procedimiento_abreviado` (`id_procedimiento_abr`) ON UPDATE CASCADE,
  ADD CONSTRAINT `procedi_abreviado_t_ibfk_2` FOREIGN KEY (`fk_tipode_fallo`) REFERENCES `tipo_de_fallo` (`id_tipo_de_fallo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_carpeta_historia`
--
ALTER TABLE `relacion_carpeta_historia`
  ADD CONSTRAINT `relacion_carpeta_historia_ibfk_1` FOREIGN KEY (`fk_historia_op`) REFERENCES `hidtoria_carpeta` (`idhistoria`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_historia_ibfk_2` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_carpeta_imputado`
--
ALTER TABLE `relacion_carpeta_imputado`
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_1` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_2` FOREIGN KEY (`fk_imputado`) REFERENCES `imputado` (`id_imputado`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_3` FOREIGN KEY (`fk_datos_extra_i`) REFERENCES `datos_espesificos_de_imputado` (`id_detos_extra`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_4` FOREIGN KEY (`fk_fecha_2`) REFERENCES `fecha_2` (`id_fecha2`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_5` FOREIGN KEY (`fk_fechas`) REFERENCES `fechas` (`id_fechas`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_6` FOREIGN KEY (`fk_fecha_intermedia`) REFERENCES `fecha_intermedia` (`id_fecha_intermedia`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_7` FOREIGN KEY (`fk_procedimiento_abre`) REFERENCES `procedi_abreviado_t` (`id_procedimiento`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_imputado_ibfk_8` FOREIGN KEY (`fk_termino`) REFERENCES `termino` (`id_termino`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_carpeta_juez`
--
ALTER TABLE `relacion_carpeta_juez`
  ADD CONSTRAINT `relacion_carpeta_juez_ibfk_1` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_carpeta_juez_ibfk_2` FOREIGN KEY (`fk_nombre_juez_turno_control`) REFERENCES `juez_de_tuno_control_nombre` (`id_nombre_juez_control_turno`);

--
-- Filtros para la tabla `relacion_ve_i`
--
ALTER TABLE `relacion_ve_i`
  ADD CONSTRAINT `relacion_ve_i_ibfk_1` FOREIGN KEY (`fk_ve`) REFERENCES `vempresaorg` (`id_veorg`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_ve_i_ibfk_2` FOREIGN KEY (`fk_r_carpeta_i`) REFERENCES `relacion_carpeta_imputado` (`id_relacion_c_i`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_victimae_carpeta`
--
ALTER TABLE `relacion_victimae_carpeta`
  ADD CONSTRAINT `relacion_victimae_carpeta_ibfk_1` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_victimae_carpeta_ibfk_2` FOREIGN KEY (`fk_ve`) REFERENCES `vempresaorg` (`id_veorg`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_victimam_carpeta`
--
ALTER TABLE `relacion_victimam_carpeta`
  ADD CONSTRAINT `relacion_victimam_carpeta_ibfk_1` FOREIGN KEY (`fk_relacion_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_victimam_carpeta_ibfk_2` FOREIGN KEY (`fk_vm`) REFERENCES `v_menor` (`id_v_menor`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_victimam_carpeta_ibfk_3` FOREIGN KEY (`fk_datos_v`) REFERENCES `datos_espesificos_v` (`id_datos_espesificos_v`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_victima_carpeta`
--
ALTER TABLE `relacion_victima_carpeta`
  ADD CONSTRAINT `relacion_victima_carpeta_ibfk_1` FOREIGN KEY (`fk_carpeta`) REFERENCES `carpeta` (`id_carpeta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_victima_carpeta_ibfk_2` FOREIGN KEY (`fk_victima`) REFERENCES `victima_p` (`id_victima_p`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_victima_carpeta_ibfk_3` FOREIGN KEY (`fk_datos_v`) REFERENCES `datos_espesificos_v` (`id_datos_espesificos_v`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_vm_i`
--
ALTER TABLE `relacion_vm_i`
  ADD CONSTRAINT `relacion_vm_i_ibfk_1` FOREIGN KEY (`fk_vm`) REFERENCES `v_menor` (`id_v_menor`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_vm_i_ibfk_2` FOREIGN KEY (`fk_datos_v`) REFERENCES `datos_espesificos_v` (`id_datos_espesificos_v`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_vm_i_ibfk_3` FOREIGN KEY (`fk_r_carpeta_i`) REFERENCES `relacion_carpeta_imputado` (`id_relacion_c_i`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `relacion_v_i`
--
ALTER TABLE `relacion_v_i`
  ADD CONSTRAINT `relacion_v_i_ibfk_1` FOREIGN KEY (`fk_datos_v`) REFERENCES `datos_espesificos_v` (`id_datos_espesificos_v`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_v_i_ibfk_2` FOREIGN KEY (`fk_victima`) REFERENCES `victima_p` (`id_victima_p`) ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_v_i_ibfk_3` FOREIGN KEY (`fk_r_carpeta_i`) REFERENCES `relacion_carpeta_imputado` (`id_relacion_c_i`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `termino`
--
ALTER TABLE `termino`
  ADD CONSTRAINT `termino_ibfk_2` FOREIGN KEY (`fk_consede_niega`) REFERENCES `sise_consede_opciones_si` (`id_se_consede`) ON UPDATE CASCADE,
  ADD CONSTRAINT `termino_ibfk_3` FOREIGN KEY (`fk_estado_actual_carapeta`) REFERENCES `estado_actual_de_carpeta` (`id_estado`) ON UPDATE CASCADE,
  ADD CONSTRAINT `termino_ibfk_4` FOREIGN KEY (`fk_seconcede_niega`) REFERENCES `seconsede_opciones` (`id_opciones`) ON UPDATE CASCADE,
  ADD CONSTRAINT `termino_ibfk_5` FOREIGN KEY (`fk_resolucion`) REFERENCES `resolucion_apelacion_mp` (`id_resolucion`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`p_codigo`) REFERENCES `persona` (`codigo_p`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `victima_p`
--
ALTER TABLE `victima_p`
  ADD CONSTRAINT `victima_p_ibfk_1` FOREIGN KEY (`fk_sexo`) REFERENCES `sexo` (`id_sexo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `v_menor`
--
ALTER TABLE `v_menor`
  ADD CONSTRAINT `v_menor_ibfk_1` FOREIGN KEY (`fk_sexo`) REFERENCES `sexo` (`id_sexo`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
