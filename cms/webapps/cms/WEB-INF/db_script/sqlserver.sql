create table tbl_right (
	rightid			smallint		not null,     --Ȩ������ID
	rightname		varchar(30)		not null,     --Ȩ��������
	rightcat		varchar(30),                          --Ȩ��������
	rightdesc		varchar(100),                         --Ȩ������
        primary key (rightid)
);

create table tbl_log (
	id			int			not null,    --ΨһID
	articleid		int			not null,    --���±��
	siteid			smallint		not null,    --վ��ID
	columnid		int					not null,		--��ĿID
	editor			varchar(30)		not null,    --ִ�ж����ı༭
	acttype			tinyint			not null,    --��������
	acttime			datetime		not null,    --����ʱ�䣨yyyy-mm-dd hh24:mi:ss��ʽ��
	maintitle		varchar(600),	 --ִ�в��������±���
	createdate	datetime,			--��������ʱ�䣨yyyy-mm-dd��ʽ��
        primary key (id)
);

create table tbl_members (
        userid       		varchar(30)   		not null,   --�û���
        siteid       		smallint      		not null,   --վ�����
        userpwd      		varchar(32)   		not null,   --�û�����
        nickname     		varchar(30)		not null,   --�û���ʵ����
        createarticles	int						not null default 0,		--�û�����������
        editarticles		int						not null default 0,		--�û��޸�������
        deletearticles	int						not null default 0,		--�û�ɾ��������
        primary key (userid)
);

create table tbl_members_rights (
        userid          	varchar(30)    		not null,   --�û�ID
        columnid        	int			not null,   --��ĿID
        rightid         	smallint		not null    --Ȩ��ID
);

create table tbl_group_rights (   	
	groupid			int          		not null,   --�û���ID
        columnid        	int,                                --��ĿID
        rightid        	 	smallint                            --Ȩ��ID
);

create table tbl_group_members (
	userid      		varchar(30)    		not null,   --�û�ID
	groupid     		int          		not null    --�û���ID
);

create table tbl_group (
	groupid     		int          		not null,    --�û���ID
	siteid      		smallint       		not null,    --վ��ID
	groupname   		varchar(20)    		not null,    --�û�������
	groupdesc   		varchar(100),                        --�û�������
        primary key (groupid)
);

create table tbl_article_auditing_info (
	id              	int          		not null,    --ΨһID
	articleid       	int          		not null,    --����˵�����ID
	sign            	varchar(30)    		not null,    --�����
	comments        	varchar(500),                        --��������
	status          	tinyint       		not null,    --״̬  0--ͨ��  1--δͨ��
	backto          	varchar(30),                         --�˻���
	createdate      	datetime                not null,    --����ʱ��
        primary key (id)
);

create table tbl_column_auditing_rules (
	id                   	int             	not null,    --ΨһID
	columnid             	int             	not null,    --��ĿID
	column_audit_rule    	varchar(300)		not null,    --��˹���
	createdate           	datetime		not null,    --����ʱ��
	lastupdated          	datetime		not null,    --�޸�ʱ��
	creator              	varchar(30)		not null,    --������
	editor               	varchar(30)		not null,    --�༭
        primary key (id)
);

create table tbl_article (
	id                   	int             	not null,    --ΨһID
	columnid             	int             	not null,    --��ĿID
	sortid               	int,                                 --�������
	maintitle            	varchar(600)   		not null,    --������
	vicetitle            	varchar(600),                        --������
	summary              	varchar(1000),                       --����
	keyword              	varchar(200),                        --�ؼ���
	source               	varchar(600),                        --��Դ
	content              	text,                                --����
	emptycontentflag     	tinyint			not null,    --�����Ƿ�Ϊ�� 0-�ǿ�  2-��
	author               	varchar(600),                        --����
	articleversion       	int,                                 --���°汾��
	publishtime          	datetime		not null,    --����ʱ��
	createdate           	datetime		not null,    --����ʱ��
	lastupdated          	datetime		not null,    --����޸�ʱ��
	dirname              	varchar(200)		not null,    --Ŀ¼
	filename             	varchar(60),                         --�ļ���
	editor               	varchar(30)        	not null,    --�༭
	status               	tinyint   		not null,    --״̬   1--����  0--ͣ��
	doclevel             	int                 	not null,    --����Ȩ��
	vicedoclevel		int,                                 --���´�Ȩ��
	pubflag              	tinyint   		not null,    --�Ƿ񷢲�  1--δ������Ҫ����  0--�ѷ���  2-����ʧ��
	auditflag            	tinyint 		not null,    --�Ƿ����  0--ͨ��    1--����
	subscriber           	tinyint   		not null,    --�Ƿ���  0--����    1--����
	lockstatus           	tinyint 		not null,    --�Ƿ�����
	lockeditor           	varchar(30),                         --������
	auditor              	varchar(200),                        --���������
	ispublished          	tinyint 		not null,    --�Ƿ������������� 0-δ�������� 1-�ѱ�������
	relatedartid         	varchar(40),                         --���µ�������� 
	indexflag            	tinyint			not null,    --�����Ƿ�����
	isjoinrss		tinyint			not null,    --�Ƿ���뵽RSS
	clicknum		int			not null,    --���������ǰ̨ʹ�ã�
	referID			int			not null,    --��δ�ã�
	modelID			int			not null,    --��δ�ã�
	saleprice            	float,                               --���ۼ۸����ڵ�������
	inprice              	float,                               --���ۣ����ڵ�������
	marketprice          	float,                               --�г��۸����ڵ�������
	stocknum             	int,                                 --������������ڵ������� 
	weight               	int,                                 --���������ڵ�������
	brand                	varchar(50),                         --Ʒ�ƣ����ڵ�������
	pic                  	varchar(30),                         --ͼƬ�����ڵ�������
	bigpic               	varchar(30),                         --��ͼƬ�����ڵ�������
	articlepic		varchar(600),
	urltype				int	not null default 0,											 --�Ƿ�ʹ���Զ����������� 0-��1-��
	defineurl			varchar(200),															 --�Զ�����������ӵ�ַ
	wordsnum			int not null default 0,											 --��������������������ͳ�ƣ�
        primary key (id)
);

create table tbl_article_extendattr (
	id                   	int             	not null,    --ΨһID
	articleid            	int             	not null,    --����ID
	ename                	varchar(50)		not null,    --Ӣ������
	type                 	tinyint			not null,    --����
	textvalue            	text,                                --�����ı���������
	stringvalue          	varchar(4000),                       --�����ַ���������
	numericvalue         	int,                                 --������ֵ������ 
	floatvalue           	float,                               --���渡��������
        primary key (id),
	CONSTRAINT fk_articleID FOREIGN KEY (articleid) REFERENCES  tbl_article(ID) ON DELETE CASCADE        
);

create table tbl_template (
	id                   	int    			not null,    --ΨһID
	columnid             	int    			not null,    --��ĿID
	isarticle           	tinyint   		not null,    --ģ������
	content              	text,                                --ģ������
	createdate           	datetime		not null,    --��������
	lastupdated          	datetime		not null,    --����޸�����
	editor               	varchar(30)		not null,    --�༭
	creator              	varchar(30)		not null,    --������
	status               	tinyint  		not null,    --״̬
	relatedcolumnid      	varchar(500),                        --�����ĿID��
	modelversion         	int,                                 --�汾��
	lockstatus           	tinyint			not null,    --����״̬
	lockeditor           	varchar(30),                         --������
	chname               	varchar(50)		not null,    --ģ����������
	defaulttemplate      	tinyint			not null,    --�Ƿ���Ĭ��ģ��
	templatename         	varchar(200)		not null,    --ģ��Ӣ������
	refermodelid         	int      		not null,    --�Ƿ��Ǳ����õ�ģ��
	isIncluded		tinyint			not null,    --�Ƿ��ǰ����ļ�
        primary key (id)
);

create table tbl_column (
	id                   	int                  	not null,     --Ψһ��ĿID
	siteid               	smallint               	not null,     --վ��ID
	parentid             	int     		not null,     --����ĿID
	orderid              	int                  	not null,     --˳���
	cname                	varchar(50)        	not null,     --��������
	ename                	varchar(50)        	not null,     --Ӣ������
	dirname              	varchar(200)          	not null,     --Ŀ¼��
	editor               	varchar(30)            	not null,     --�༭
	extname              	varchar(10)            	not null,     --�ļ���չ��
	createdate           	datetime                not null,     --��������
	lastupdated          	datetime		not null,     --����޸�����
	isdefineattr         	tinyint  		not null,     --�Ƿ�����չ����
 	hasarticlemodel      	tinyint  		not null,     --�Ƿ�������ģ��
	isaudited            	tinyint  		not null,     --�Ƿ���Ҫ���
	isproduct            	tinyint    		not null,     --�Ƿ�����Ʒ��Ŀ
	ispublishmore        	tinyint    		not null,     --�Ƿ������ģ�巢��
	languagetype         	tinyint    		not null,     --��������
	columndesc           	varchar(200),                         --��Ŀ����
	xmltemplate          	varchar(4000),                        --��չ���Զ���
	contentshowtype				tinyint				not null,								--ҳ��չʾ��ʽWEB��WEB+WAP
	isrss									tinyint	default 0 not null,						--���屾��Ŀ�Ƿ񷢲�RSS
	getRssArticleTime			int,																--����RSS������ʱ���
	archivingrules				tinyint default 0 not null,						--���屾��Ŀ�趨�Ĺ鵵����
        primary key (id)
);

create table tbl_mark (
	id                   	int             	not null,
	columnid             	int             	not null,
	siteid               	smallint		not null,
	content              	varchar(4000)		not null,
	marktype             	tinyint			not null,
	notes                	varchar(200),
	lockeditor           	varchar(30),
	lockflag             	tinyint			not null,
	pubflag              	tinyint			not null,
	innerhtmlflag        	tinyint			not null,
	formatfilenum        	int,
	createdate           	datetime		not null,
	updatedate           	datetime		not null,
	publishtime         	datetime		not null,
	chinesename          	varchar(40)		not null,
	relatedcolumnid      	varchar(500),
        primary key (id)
);

create table tbl_viewfile (   	
    	id		      	int             	not null,
			siteid                	smallint		not null,
    	type                  	smallint		not null,
    	content               	text			not null,
    	chinesename           	varchar(50)		not null,
    	editor                	varchar(30)		not null,
    	lockflag              	tinyint			not null,
    	notes                 	varchar(300),
    	createdate            	datetime		not null,
    	updatedate            	datetime		not null,
        primary key (id)
);

create table tbl_siteipinfo(
    	id                    	int              	not null,
    	siteid                	smallint              	not null,
    	siteip                	varchar(60)     	not null,
    	sitename              	varchar(50)		not null,
    	docpath               	varchar(100)     	not null,
    	ftpuser               	varchar(50),
    	ftppasswd             	varchar(50),
    	publishway            	tinyint			not null,
    	status                	tinyint			not null,
        primary key (id)
);

create table tbl_siteinfo (
	siteid               	smallint               	not null,
	sitename             	varchar(50)    		not null,
	imagesdir            	tinyint          	not null,
	cssjsdir							tinyint						not null,
	tcflag               	tinyint			not null,
	wapflag								tinyint			default 0 not null,
	pubflag              	tinyint          	not null,
	bindflag             	tinyint          	not null,
	createdate           	datetime		not null,
	berefered		tinyint			not null,
	config			varchar(200),
        primary key (siteid)
);

create table tbl_referred_article (
	articleid         int       not null,								--���Ƽ�������id
	columnid 	      	int 			not null,								--���±��Ƽ�����Ŀ����Ŀid
	orders						int		default 0	not null,					--��ʾѡ��������������
	createdate				datetime,													--�����Ƽ�����
	title							varchar(600)											--�����Ƽ���ı���
);

create table tbl_publish_queue (
	id            		int               	not null,
	siteid	      		smallint               	not null,
	type 	      		tinyint 		not null
);

create table tbl_new_publish_queue (
	id         		int 			not null,
	siteid     		smallint		not null,
	targetid   		int 			not null,
	type       		tinyint,		--1����,2��Ŀģ��,3��ҳģ��,4���
	status     		tinyint,
	createdate    		datetime,
	publishdate   		datetime,
	uniqueid   		varchar(100),
        primary key (id)
);

create table tbl_picture
(
  ID         int,
  SITEID     int,
  COLUMNID   int,
  WIDTH      int not null,
  HEIGHT     int not null,
  PICSIZE    int not null,
  PICNAME    varchar(200),
  IMGURL     varchar(255) not null,
  CREATEDATE datetime default getdate() not null,
  NOTES			 varchar(500)
);

create table tbl_relatedartids
(
  ID         int not null,
  cname			 varchar(100) not null,
  articleid	 int not null,
  type       int,
  joinedid     int
);

create table tbl_article_keyword
(
  ID         int not null,
  siteid		 int not null,
  columnid	 int not null,
  keyword    varchar(200),
  url				 varchar(200),
  primary key (id)
);

insert into tbl_right values(1,'��Ŀ����','CM','��Ŀ����');
insert into tbl_right values(2,'ģ�����','MM','ģ�����');
insert into tbl_right values(3,'���¹���','AM','���±༭');
insert into tbl_right values(4,'�ϴ��ļ�','FU','�ϴ��ļ�');
insert into tbl_right values(5,'����ļ�','FA','����ļ�');
insert into tbl_right values(6,'��������','PA','��������');
insert into tbl_right values(7,'�ƶ�����','MA','�ƶ�����');
insert into tbl_right values(50,'������','AR','������');
insert into tbl_right values(51,'д����','AW','д����');
insert into tbl_right values(52,'ɾ����','AD','ɾ����');
insert into tbl_right values(54,'վ�����','WM','վ�����');
insert into tbl_right values(55,'�ļ��༭','FE','�ļ��༭');
insert into tbl_right values(56,'�ļ�ɾ��','FD','�ļ�ɾ��');

insert into tbl_members values('admin',-1,'4346D362F67C89D7AB4E28732A1B1CE8','ϵͳ����Ա',0,0,0);
insert into tbl_column values(0,0,-1,0,'��ҳ','home','/','admin','html',getdate(),getdate(),0,0,0,0,0,0,0,'','',0,0,0);
