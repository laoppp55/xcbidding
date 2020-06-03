	   /*
       /* 获取CKEditorFuncNum
       */
		function getUrlParam(url)   
        {   
            var reParam = new RegExp('(?:[\?&]|&amp;)CKEditorFuncNum=([^&]+)', 'i') ;   
            var match = url.match(reParam) ;   
    
            return (match && match.length > 1) ? match[1] : '' ;   
        }   


	   CKEDITOR.dialog.add( 'myAddImage', function( editor )
        {
            return {
                    title : '添加图片',
                    minWidth : 400,
                    minHeight : 200,
                    contents : 
                    [
                        {
                            id : 'addImage',
                            label : '添加图片',
                            title : '添加图片',
                            filebrowser : 'uploadButton',
                            elements :
                            [
                              {    
                                  id : 'txtUrl',
                                  type : 'text',
                                  label : '图片网址',
                                  required: true
                              },
                              {
                                    id : 'photo',
                                    type : 'file',
                                    label : '上传图片',
                                    style: 'height:40px',
                                    size : 38
                              },
                              {
                                   id : 'uploadButton',
                                   type : 'fileButton',
                                   label : '上传',
                                   filebrowser :
                                   {
                                        action : 'QuickUpload',
                                        target : 'addImage:txtUrl',
                                        onSelect:function(fileUrl, errorMessage){
                                            //在这里可以添加其他的操作
											
                                        }
                                   },

                                   onClick: function(){   
                                        var d = this.getDialog();   
                                        var _txtUrl = d.getContentElement('addImage','txtUrl');   
                                        var _photo =  d.getContentElement('addImage','photo');   
                                        var _frameId = _photo._.frameId;   
                                        var _iframe =  CKEDITOR.document.getById(_frameId);   
										
                                        //给iframe添加onload事件   
										//alert(getUrlParam(_photo.action)+"==" + _txtUrl + "==" + _photo + "==" + _frameId);
                                        _iframe.setAttribute('onload','getAjaxResult(this,'+getUrlParam(_photo.action)+')');   
                                   },   

                                   'for' : [ 'addImage', 'photo']
                              }
                            ]
                        }
                   ],
                   onOk : function(){
                       _src = this.getContentElement('addImage', 'txtUrl').getValue();
                       if (_src.match(/(^\s*(\d+)((px)|\%)?\s*$)|^$/i)) {
                           alert('请输入网址或者上传文件');
                           return false;
                       }
                       this.imageElement = editor.document.createElement( 'img' );
                       this.imageElement.setAttribute( 'alt', '' );
                       this.imageElement.setAttribute( 'src', _src );
                       //图片插入editor编辑器
                       editor.insertElement( this.imageElement );
                   }
            };
        });
