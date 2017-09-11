1、命令行工具：Git for windows
下载地址：https://git-for-windows.github.io/

2、 操作系统中可视化工具：TortoiseGit
下载地址： https://tortoisegit.org/

3、 Eclipse插件： Egit
Eclipse自带，插件市场搜索最新版

4、 GitHub网站
http://www.github.com
——————————————————————————————————————————————————————————————————————

Git是分布式版本控制系统，所以需要填写用户名和邮箱作为一个标识。

C:\Users\admin路径下的.gitconfig文件里面可以看到

--global 表示全局属性，所有的git项目都会共用属性


1.创建版本库
在项目文件夹内，执行:  git  init


2.提交文件
新建文件后，通过git  status  进行查看文件状态
将文件添加到暂存区   git  add  文件名
提交文件到本地库  git  commit
编写注释 ，完成提交
或者也可以git  commit  –m “注释内容”, 直接带注释提交


3.查看文件提交记录
执行 git  log  文件名     进行查看历史记录
git log  --pretty=oneline 文件名      简易信息查看版本 


4.回退历史
git  reset  --hard HEAD^   回退到上一次提交
git  reset  --hard HEAD~n  回退n次操作


5.版本穿越
进行查看历史记录的版本号，执行 git  reflog  文件名
执行 git  reset  --hard  版本号


6.还原文件
git  checkout -- 文件名  


7.撤销某个文件暂存区的提交
git  reset  文件名

工作区(Working Directory):就是你电脑本地硬盘目录
本地库(Repository):工作区有个隐藏目录.git，它就是Git的本地版本库
暂存区(stage):一般存放在"git目录"下的index文件（.git/index）中，所以我们把暂存区有时也叫作索引（index）。

8.去掉某个文件的版本追踪
 git  rm  -- cached  文件名

9.比较文件
git  diff  文件名
git  diff  HEAD 文件名

创建分支
git  branch  <分支名>
git branch –v  查看分支

切换分支
git checkout  <分支名>
一步完成： git checkout  –b  <分支名>

合并分支
先切换到主干   git  checkout  master
git  merge  <分支名>  //必须是主线上合并分支

冲突
冲突一般指同一个文件同一位置的代码，在两种版本合并时版本管理软件无法判断到底应该保留哪个版本，因此会提示该文件发生冲突，需要程序员来手工判断解决冲突。

合并时冲突
程序合并时发生冲突系统会提示CONFLICT关键字，命令行后缀会进入MERGING状态，表示此时是解决冲突的状态。

解决冲突
此时通过git diff 可以找到发生冲突的文件及冲突的内容

然后修改冲突文件的内容，再次git add <file> 和git commit 提交后，后缀MERGING消失，说明冲突解决完成。

————————————————————————————————————————————————————————————
网址
https://github.com/
注册账号的注意事项
 不要使用163的邮箱，有可能收不到验证邮件。
较长时间不使用有可能被Github冻结账号。请登录其客服页面https://github.com/contact，填写账号恢复申请。 

是什么
GitHub是一个Git项目托管网站,主要提供基于Git的版本托管服务


增加远程地址
git remote add  <远端代号>   <远端地址> 。
 <远端代号> 是指远程链接的代号，一般直接用origin作代号，也可以自定义。
<远端地址> 默认远程链接的url
例： git  remote  add  origin  https://github.com/user111/Helloworld.git

推送到远程库
git  push   <远端代号>    <本地分支名称>。
 <远端代号> 是指远程链接的代号。
 <分支名称>  是指要提交的分支名字，比如master。
例： git  push  origin  master

从GitHub上克隆一个项目
git  clone   <远端地址>   <新项目目录名>。
 <远端地址> 是指远程链接的地址。
<项目目录名>  是指为克隆的项目在本地新建的目录名称，可以不填，默认是GitHub的项目名。
命令执行完后，会自动为这个远端地址建一个名为origin的代号。
例 git  clone  https://github.com/user111/Helloworld.git   hello_world

从GitHub更新项目
git  pull   <远端代号>   <远端分支名>。
 <远端代号> 是指远程链接的代号。
<远端分支名>是指远端的分支名称，如master。 
例 git pull origin  master

以上对项目的操作方式，必须是项目的创建者或者合作伙伴。
合作伙伴添加方式如下图: 在项目中点击settings页签，然后点击Collaborators,然后在文本框中搜索合作伙伴的邮箱或者账号。点击添加。
添加后GitHub会给合作伙伴对应的邮箱发一封，邀请邮件。

邀请你的同事成为合作伙伴
合作伙伴会收到邀请邮件。点击View invitation 按钮后会跳转至GitHub页面，让合作伙伴选择，是否接受邀请。
点击接受后，则合伙伙伴正式加入项目，获得直接提交代码的权限。 

协作冲突
在上传或同步代码时，由于你和他人都改了同一文件的同一位置的代码，版本管理软件无法判断究竟以谁为准，就会报告冲突,需要程序员手工解决。
解决冲突
三板斧：
1、修改合并
2、git add 
3、git commit


两种模式：https VS ssh 
ssh模式比https模式的一个重要好处就是，每次push、pull、fetch等操作时，不用重复填写遍用户名密码。
      前提是你必须是这个项目的拥有者或者合作者，且配好了ssh key。

如何配置SSH key
步骤1：检查你的电脑上是否已经生成了SSH Key 在git bash下执行如下命令
如果已经有这个文件包 删除就行了

步骤2：创建SSH Key： ssh-keygen -t rsa -C   XXXXXX@126.com
成功的话会在~/下生成.ssh文件夹，进去，打开id_rsa.pub，复制里面的key。

步骤3：进入.ssh文件包，打印id_rsa.pub的内容，复制全部内容

步骤4.登录Github后，右上角点击setting
步骤5.在左侧菜单中选择SSH and GPG keys,
在右边点击New SSH key
步骤6 :Title随便写，Key 把之前id_rsa.pub的内容复制进去，点击Add SSH key，设置ssh key 完成

要建立新的远程代号git remote add  originssh  git@github.com:yuebuqun777888/bixiejianfa.git
以后再提交代码的时候就不用输入密码了（第一次使用会要求输入个 yes）
git push originssh master

真多；
