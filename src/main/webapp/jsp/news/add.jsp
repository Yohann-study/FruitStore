<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/17
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>添加公告</title>
</head>
<body style="background-color: #9acfea;">
    <div class="panel admin-panel">
        <div class="panel-head" id="add">
            <strong><span class="icon-pencil-square-o">添加公告</span> </strong>
        </div>
        <div class="body-content">
            <form action="${ctx}/news/exAdd" method="post" class="form-x" enctype="multipart/form-data">
                <div class="form-group">
                    <div class="label"><label>标题：</label></div>
                    <div class="field">
                        <input type="text" class="input w50" name="name" data-validate="required:请输入标题" />
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label"><label>内容：</label></div>
                    <div class="field">
                        <script type="text/plain" id="remark_txt_1" name="content" style="width: 100%;height: 300px;"></script>
                        <script type="text/javascript">
                            var editor = UE.getEditor('remark_txt_1');
                            UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
                            UE.Editor.prototype.getActionUrl = function (action) {
                                if(action == 'uploadimage' || action == 'uploadscrawl' || action == 'uploadvideo'){
                                    return '${ctx}/ueditor/saveFile';
                                }else{
                                    return this._bkGetActionUrl.call(this,action);
                                }
                            }
                        </script>
                        <div class="tips"></div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="label"></div>
                    <div class="field">
                        <button class="button bg-main icon-check-square-o" type="submit">提交</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>