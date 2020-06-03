CREATE TABLE TBL_RIGHT (
	RIGHTID		varchar2(30) NOT NULL,
	RIGHTNAME	varchar2(30)  NOT NULL,
	RIGHTCAT	varchar2(30)	 NULL,
	RIGHTDESC	varchar2(100) NULL,
	PRIMARY KEY (RIGHTID) 
);

insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('ColumnManage','��Ŀ����','ColumnManage','�������޸ĺ�ɾ����Ŀ');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('ModelManage','ģ�����','ModelManage','�ϴ���װ�롢���ӡ��޸ĺ�ɾ��ģ��');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('ArticleManage','���¹���','ArticleManage','¼�롢�޸ĺ�ɾ������');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('FileUpload','�ļ��ϴ�','FileUpload','�ϴ��ļ���ɾ���ϴ��ļ�');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('FileAudit','�ļ����','FileAudit','����ļ��Ƿ�������ⷢ��');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('Publish','���·���','Publish','������������������������������');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('ViewLog','�鿴LOG�������','ViewLog','��Ȩ�鿴LOG��������');
insert into tbl_right(rightid,rightname,rightcat,rightdesc) values('UserManage','����ϵͳ�û�','UserManage','Ϊ�û�����Ȩ�޺Ϳɹ������Դ');

CREATE TABLE TBL_ROLE (
	ROLEID		varchar2(30) NOT NULL,
	ROLENAME	varchar2(30) NOT NULL,
	ROLEDESC	varchar2(100) NULL,
	PRIMARY KEY(ROLEID)
);

CREATE TABLE TBL_ROLERIGHT (
	ROLEID		varchar2(30) NOT NULL,
	RIGHTID		varchar2(30) NOT NULL,
	PRIMARY KEY(ROLEID,RIGHTID)
);

CREATE TABLE TBL_GROUP (
	GROUPID		varchar2(30) NOT NULL,
	GROUPNAME	varchar2(30) NOT NULL,
	GROUPDESC	varchar2(100) NULL,
	PRIMARY KEY (GROUPID) 
);

CREATE TABLE TBL_GROUPROLE (
	GROUPID 	varchar2(30) NOT NULL,
	ROLEID		varchar2(30) NOT NULL,
	PRIMARY	KEY(GROUPID,ROLEID) 
);

CREATE TABLE TBL_Members (
  USERID       varchar2(30) NOT NULL, 
  USERPWD      varchar2(8) NOT NULL,
  NICKNAME     varchar2(30) null,
  Email        varchar2(30) NOT NULL,
  Phone        varchar2(30) NULL,
  MobilePhone  varchar2(30) NULL,
  URL          varchar2(50) NULL,
  FilePath     varchar2(50) NULL,
  PRIMARY KEY (USERID)  
);
insert into tbl_members values('admin','!1','�����û�','admin@admin.com','111111','1111','http://www.sohu.com','c:\work');

CREATE TABLE TBL_MEMBERGROUP (
	USERID      varchar2(30) NOT NULL,
	GROUPID     varchar2(30) NOT NULL,
	PRIMARY KEY(USERID,GROUPID)
);

create table tbl_columnuser(
	ColumnEname     varchar2(50)  Not Null , 
	ColumnChname    varchar2(50)  Not null,
	USERID          varchar2(30) NOT NULL,
	columnID 	number(6,0) not NUll,
	PRIMARY KEY(columnID,USERID)
);

Create table TBL_Column(
   ID                          number(12,0)             Not Null Primary key,   --���,PK
   Code                        varchar2(60)             NULL,                   --��Ŀ����
   DirName                     varchar2(200)            Null,                   --���ɵ�Ŀ¼
   OrderID                     Smallint                 Null,                   --��ʾ����
   ParentID                    number(6,0) Default(0)   Not NUll,               --�����
   defaultContentTemplateID    number(6,0),                                     --Ĭ�ϵ���Ŀ����ģ��ID
   defaultIndexTemplateID      number(6,0),                                     --Ĭ�ϵ���Ŀ����ģ��ID
   Cname                       varchar2(600)             Not Null,              --��������
   Ename                       varchar2(600)             Not Null,              --Ӣ������
   ActiveID                    number(1,0) default(1)   Not Null,               --��Ч���   
   Createdate                  date  Null,                                      --����ʱ��
   LastUpdated                 date  Null,                                      --����޸�ʱ��
   Editor                      varchar2(30) Null                                --����޸���   
);	
insert into tbl_column values(0,'000','/',0,-1,0,0,'��ҳ','home',1,sysdate,sysdate,'admin');

Create table TBL_Template(
   ID               number(6,0)                       Not Null Primary key,      --���,PK
   ColumnID         number(6,0)                       Null,                      --������Ŀ,FK(��Ŀ)
   IsArticle        number(1,0)                       Default 0 not null,        --0 ����ģ��  1 ��Ŀģ��
   Content          long                              Null,                      --���ģ�ģ������
   Createdate       date                              Null,                      --����ʱ��   getdate
   LastUpdated      date                              Null,                      --����޸�ʱ��
   Editor           varchar2(30)                      Null,                      --����޸���   FK���û���
   creator          varchar2(30),                                                --ģ��װ����
   lockstatus       number(1,0),                                                 --ģ�������״̬
   chname           varchar2(50),                                                --��Ŀ��������
   defaultTemplate  int                                                          --��ĿĬ�ϵ�ģ��
);

Create table TBL_Article
(
   ID                  number(12,0)          Not Null Primary Key,      --���PK
   ColumnID            number(6,0)           Not Null,                  --������Ŀ,FK(��Ŀ)
   SortID              Smallint              null,                      --����
   MainTitle           varchar2(500)         Null,                      --����
   ViceTitle           varchar2(500)         Null,                      --����
   Summary             varchar2(200)         Null,                      --��Ҫ����
   Keyword             varchar2(100)         Null,                      --�ؼ���
   Source              varchar2(500)         Null,                      --������Դ
   Content             long                  Null,                      --��������
   author              varchar2(50)          Null,                      --��������
   PublishTime         date                  Null,                      --ҳ�淢��ʱ��
   Createdate          date                  Null,                      --��������ʱ��   getdate
   LastUpdated         date                  Null,                      --����޸�ʱ��
   DirName             varchar2(600)          Null,                      --���ɵ�Ŀ¼
   FileName            varchar2(600)          Null,                      --���ɵ�HTML�ļ���
   Editor              varchar2(30)          Not Null,                  --����޸���   FK���û���   
   status              number(1,0)           Default(1) Not Null,       --�Ƿ���ã�0-������ 1-����ʹ��
   doclevel            number(1,0)           Default(0) Not Null,       --�Ƿ���Ҫ��0-��ͨ 1-��Ҫ
   pubflag             number(1,0)           Default(1) Not Null,       --������ǣ�0-������ 1-��Ҫ���� 2-����ʧ�ܣ����·���
   auditflag           number(1,0)           Default(0) Not Null,       --���״̬��0-������ 1-������� 2-���˸�
   subscriber          number(1,0)           Default(1) not null        --�Ƿ��͸������ߣ�1-��Ҫ���� 0-������ 2-�Ѿ�����
);


--������˷�ʽ
create table tbl_column_auditing_rules (
   ID                  number(12,0)   Not Null Primary Key,      --���PK
   columnID            number(6,0)    Not Null,                  --������Ŀ,FK(��Ŀ)
   column_audit_rule   varchar2(1000),
   createdate          date,
   lastupdated         date,
   creator             varchar2(30),
   editor              varchar2(30),
   CONSTRAINT fk_auditcolumn_id FOREIGN KEY (columnID) REFERENCES  tbl_column(ID)   
);

create table tbl_article_auditing_rules (
   ID                  number(12,0)       Not Null Primary Key,      --���PK
   articleID           number(12,0)       Not Null,                  --���±��fk(references(tbl_article))
   article_audit_rule  varchar2(1000),
   auditing_comments   varchar2(4000),
   auditing_sign_name  varchar2(100),
   createdate          date,
   lastupdated         date,
   creator             varchar2(30),
   editor              varchar2(30),
   CONSTRAINT fk_auditarticle_id FOREIGN KEY (articleID) REFERENCES  tbl_article(ID)   
);

--������˷�ʽ����

create table TBL_PublishedArticle (
    ID                number(6,0) not null primary key,
    publishedtime     date,
    publishername     varchar2(50),
    filename          varchar2(300),
    url               varchar2(300),
    publishstatus     number(2,0),
    publishtime       date
);

create table TBL_topic (
    ID                number(6,0) not null primary key,
    author            varchar2(30),
    chname            varchar2(30),
    enname            varchar2(30),
    keyword           varchar2(50),                --�ؼ�����಻����5��
    description       varchar2(300),
    collist           varchar2(300),
    options           varchar2(5),
    liststyle         number(2,0),
    modelname         varchar2(50),
    createdate        date
);

create table tbl_logsummary (
    ID                     number(20,0) not null primary key,
    websitename            varchar2(100),
    pvnmuber               number(20,0),
    usersessions           number(20,0),
    averagesessionlength   varchar2(20),
    uniqueusers            number(20,0),
    createdate             date
);

create table tbl_logdetail (
    ID                     number(20,0) not null primary key,
    websiteid              number(20,0),
    urlname                varchar2(300),
    pvnmuber               number(20,0),
    usersessions           number(20,0),
    createdate             date,
    CONSTRAINT fk_websiteid FOREIGN KEY (websiteid) REFERENCES  tbl_logsummary(ID)
);

create table TBL_EnChPath (
    chinesPath             varchar2(250),
    englishpath            varchar2(250)
);

create table cms_siteinfo(
    id                    number(5,0),
    siteIP                varchar2(100),
    docrootpath           varchar2(100) not null,
    ftpuser               varchar2(100),
    ftppasswd             varchar2(100),
    domainname            varchar2(255) not null,
    publishway            number(1,0),
    primary               key(id)
);

CREATE VIEW VW_USERRIGHT AS SELECT TBL_MEMBERGROUP.USERID, TBL_RIGHT.RIGHTID,TBL_RIGHT.RIGHTCAT
FROM TBL_MEMBERGROUP ,TBL_GROUPROLE, TBL_ROLERIGHT,TBL_RIGHT 
WHERE (TBL_MEMBERGROUP.GROUPID = TBL_GROUPROLE.GROUPID) AND (TBL_GROUPROLE.ROLEID = TBL_ROLERIGHT.ROLEID) 
AND (TBL_ROLERIGHT.RIGHTID = TBL_RIGHT.RIGHTID);