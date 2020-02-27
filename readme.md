# git 上传测试
``` bash
1.把文件添加到版本库中，使用命令 git add .添加到暂存区里面去，不要忘记后面的小数点“.”，意为添加文件夹下的所有文件
$ ：git add .

2.用命令 git commit告诉Git，把文件提交到仓库。引号内为提交说明
$ ：git commit -m 'first commit'

3.把本地库的内容推送到远程，使用 git push命令，实际上是把当前分支master推送到远程。执行此命令后会要求输入用户名、密码，验证通过后即开始上传。
 $ ：git push -u origin master
```
##Git提交测试中文乱码 成功