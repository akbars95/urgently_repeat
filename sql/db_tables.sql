create database [op9_9];

USE [op9_9]
GO

/****** Object:  Table [dbo].[languages]    Script Date: 12/23/2015 16:55:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[languages](
	[language_id] [int] IDENTITY(1,1) NOT NULL,
	[language_name_short] [nvarchar](3) NOT NULL,
	[language_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_languages] PRIMARY KEY CLUSTERED 
(
	[language_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[tags]    Script Date: 12/23/2015 16:55:34 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tags](
	[tag_id] [int] IDENTITY(1,1) NOT NULL,
	[tag_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tags] PRIMARY KEY CLUSTERED 
(
	[tag_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[book_categories]    Script Date: 12/23/2015 16:55:47 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[book_categories](
	[book_category_id] [int] IDENTITY(1,1) NOT NULL,
	[book_category_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_book_categories] PRIMARY KEY CLUSTERED 
(
	[book_category_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[book_subcategories]    Script Date: 12/23/2015 16:56:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[book_subcategories](
	[book_subcategory_id] [int] IDENTITY(1,1) NOT NULL,
	[book_category_id] [int] NOT NULL,
	[book_subcategory_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_book_subcategories] PRIMARY KEY CLUSTERED 
(
	[book_subcategory_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[book_subcategories]  WITH CHECK ADD  CONSTRAINT [FK_book_subcategories_book_categories] FOREIGN KEY([book_category_id])
REFERENCES [dbo].[book_categories] ([book_category_id])
GO

ALTER TABLE [dbo].[book_subcategories] CHECK CONSTRAINT [FK_book_subcategories_book_categories]
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[file_formats]    Script Date: 12/23/2015 16:56:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[file_formats](
	[file_format_id] [int] IDENTITY(1,1) NOT NULL,
	[file_format_name] [varchar](50) NOT NULL,
 CONSTRAINT [PK_file_formats] PRIMARY KEY CLUSTERED 
(
	[file_format_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[countries]    Script Date: 12/23/2015 16:56:28 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[countries](
	[country_id] [int] IDENTITY(1,1) NOT NULL,
	[country_name] [varchar](50) NULL,
 CONSTRAINT [PK_countries] PRIMARY KEY CLUSTERED 
(
	[country_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[cities]    Script Date: 12/23/2015 16:56:40 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[cities](
	[city_id] [int] IDENTITY(1,1) NOT NULL,
	[city_name] [varchar](50) NOT NULL,
	[city_country_id] [int] NOT NULL,
 CONSTRAINT [PK_cities] PRIMARY KEY CLUSTERED 
(
	[city_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[cities]  WITH CHECK ADD  CONSTRAINT [FK_cities_countries] FOREIGN KEY([city_country_id])
REFERENCES [dbo].[countries] ([country_id])
GO

ALTER TABLE [dbo].[cities] CHECK CONSTRAINT [FK_cities_countries]
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[authors]    Script Date: 12/23/2015 16:56:52 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[authors](
	[author_id] [int] IDENTITY(1,1) NOT NULL,
	[author_firstname] [varchar](50) NOT NULL,
	[author_lastname] [varchar](50) NOT NULL,
	[author_country_id] [int] NULL,
 CONSTRAINT [PK_authors] PRIMARY KEY CLUSTERED 
(
	[author_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[authors]  WITH CHECK ADD  CONSTRAINT [FK_authors_countries] FOREIGN KEY([author_country_id])
REFERENCES [dbo].[countries] ([country_id])
GO

ALTER TABLE [dbo].[authors] CHECK CONSTRAINT [FK_authors_countries]
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[publishers]    Script Date: 12/23/2015 16:57:13 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[publishers](
	[publisher_id] [int] IDENTITY(1,1) NOT NULL,
	[publisher_name] [varchar](50) NOT NULL,
	[publisher_city_id] [int] NOT NULL,
 CONSTRAINT [PK_publishers] PRIMARY KEY CLUSTERED 
(
	[publisher_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[publishers]  WITH CHECK ADD  CONSTRAINT [FK_publishers_cities] FOREIGN KEY([publisher_city_id])
REFERENCES [dbo].[cities] ([city_id])
GO

ALTER TABLE [dbo].[publishers] CHECK CONSTRAINT [FK_publishers_cities]
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[books]    Script Date: 12/23/2015 16:57:25 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[books](
	[book_id] [uniqueidentifier] NOT NULL,
	[book_name] [varchar](255) NOT NULL,
	[book_isbn] [varchar](50) NULL,
	[book_count_of_pages] [int] NOT NULL,
	[book_file_format_id] [int] NOT NULL,
	[book_publish_year] [int] NOT NULL,
	[book_publisher_id] [int] NOT NULL,
	[book_file_size] [decimal](10, 2) NULL,
	[book_language_id] [int] NOT NULL,
	[book_subcategory_id] [int] NOT NULL,
 CONSTRAINT [PK_books] PRIMARY KEY CLUSTERED 
(
	[book_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[books]  WITH CHECK ADD  CONSTRAINT [FK_books_book_subcategories] FOREIGN KEY([book_subcategory_id])
REFERENCES [dbo].[book_subcategories] ([book_subcategory_id])
GO

ALTER TABLE [dbo].[books] CHECK CONSTRAINT [FK_books_book_subcategories]
GO

ALTER TABLE [dbo].[books]  WITH CHECK ADD  CONSTRAINT [FK_books_file_formats] FOREIGN KEY([book_file_format_id])
REFERENCES [dbo].[file_formats] ([file_format_id])
GO

ALTER TABLE [dbo].[books] CHECK CONSTRAINT [FK_books_file_formats]
GO

ALTER TABLE [dbo].[books]  WITH CHECK ADD  CONSTRAINT [FK_books_languages] FOREIGN KEY([book_language_id])
REFERENCES [dbo].[languages] ([language_id])
GO

ALTER TABLE [dbo].[books] CHECK CONSTRAINT [FK_books_languages]
GO

ALTER TABLE [dbo].[books]  WITH CHECK ADD  CONSTRAINT [FK_books_publishers] FOREIGN KEY([book_publisher_id])
REFERENCES [dbo].[publishers] ([publisher_id])
GO

ALTER TABLE [dbo].[books] CHECK CONSTRAINT [FK_books_publishers]
GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[book_author]    Script Date: 12/23/2015 16:57:35 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[book_author](
	[book_id] [uniqueidentifier] NOT NULL,
	[author_id] [int] NOT NULL
) ON [PRIMARY]

GO


USE [op9_9]
GO

/****** Object:  Table [dbo].[book_tags]    Script Date: 12/23/2015 16:57:48 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[book_tags](
	[book_id] [uniqueidentifier] NOT NULL,
	[book_tag_id] [int] NOT NULL
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[book_tags]  WITH CHECK ADD  CONSTRAINT [FK_book_tags_books] FOREIGN KEY([book_id])
REFERENCES [dbo].[books] ([book_id])
GO

ALTER TABLE [dbo].[book_tags] CHECK CONSTRAINT [FK_book_tags_books]
GO

ALTER TABLE [dbo].[book_tags]  WITH CHECK ADD  CONSTRAINT [FK_book_tags_tags] FOREIGN KEY([book_tag_id])
REFERENCES [dbo].[tags] ([tag_id])
GO

ALTER TABLE [dbo].[book_tags] CHECK CONSTRAINT [FK_book_tags_tags]
GO


