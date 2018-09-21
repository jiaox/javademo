package com.jiaox.fileconvert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.rtf.RtfWriter2;

public class TestWordImage {
	
	public static void main(String[] args) throws MalformedURLException, IOException, DocumentException {


	       // 设置纸张大小

	       Document document = new Document(PageSize.A4);

	       // 建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中
	       // ByteArrayOutputStream baos = new ByteArrayOutputStream();

	       File file = new File("D://report.doc");

	       RtfWriter2.getInstance(document, new FileOutputStream(file));

	       document.open();

	       // 设置中文字体

	       BaseFont bfChinese = BaseFont.createFont(BaseFont.HELVETICA,
	                  BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);

	       // 标题字体风格

	       Font titleFont = new Font(bfChinese, 12, Font.BOLD);

	       // // 正文字体风格
	       //
	       Font contextFont = new Font(bfChinese, 10, Font.NORMAL);

	       Paragraph title = new Paragraph("统计报告");
	       //
	       // 设置标题格式对齐方式

	       title.setAlignment(Element.ALIGN_CENTER);

	       // title.setFont(titleFont);

//	       document.add(title);

	       String contextString = "iText是一个能够快速产生PDF文件的java类库。"

	       + " \n"// 换行 + "iText的java类对于那些要产生包含文本，"

	               + "表格，图形的只读文档是很有用的。它的类库尤其与java Servlet有很好的给合。"

	               + "使用iText与PDF能够使你正确的控制Servlet的输出。";

	       Paragraph context = new Paragraph(contextString);

	       // 正文格式左对齐

	       context.setAlignment(Element.ALIGN_LEFT);

	       // context.setFont(contextFont);

	       // 离上一段落（标题）空的行数

	       context.setSpacingBefore(5);

	       // 设置第一行空的列数

	       context.setFirstLineIndent(20);

//	       document.add(context);
	       //
	       // // 利用类FontFactory结合Font和Color可以设置各种各样字体样式
	       //
	       // Paragraph underline = new Paragraph("下划线的实现", FontFactory.getFont(
	       // FontFactory.HELVETICA_BOLDOBLIQUE, 18, Font.UNDERLINE,
	       // new Color(0, 0, 255)));
	       //
	       // document.add(underline);
	       //

	       // // 添加图片 Image.getInstance即可以放路径又可以放二进制字节流
	       //


//	       Image img = Image.getInstance("D:\\testimage\\1.png");//http://localhost:9999/2018/01/19/MTgwMTE5OTIzODk4MjY4/1.png
	       Image img = Image.getInstance("http://localhost:9999/2018/01/19/MTgwMTE5OTIzODk4MjY4/1.png");
	       img.setAbsolutePosition(0, 0);

	       img.setAlignment(Image.LEFT);// 设置图片显示位置

	       //
	        img.scaleAbsolute(530, 720);// 直接设定显示尺寸
	       //
//	         img.scalePercent(100);//表示显示的大小为原尺寸的50%
	       //
//	         img.scalePercent(25, 12);//图像高宽的显示比例
	       //
	       // // img.setRotation(30);//图像旋转一定角度
	       //
	       document.add(img);
	       
//	       Image img2 = Image.getInstance("D:\\testimage\\2.png");
	       Image img2 = Image.getInstance("http://localhost:9999/2018/01/19/MTgwMTE5OTIzODk4MjY4/2.png");
	       img2.setAbsolutePosition(0, 0);

	       img2.setAlignment(Image.LEFT);// 设置图片显示位置

	       //
	        img2.scaleAbsolute(530, 720);// 直接设定显示尺寸
	       //
//	         img.scalePercent(100);//表示显示的大小为原尺寸的50%
	       //
//	         img.scalePercent(25, 12);//图像高宽的显示比例
	       //
	       // // img.setRotation(30);//图像旋转一定角度
	       //
	       document.add(img2);

	       document.close();

	       // 得到输入流
	       // wordFile = new ByteArrayInputStream(baos.toByteArray());
	       // baos.close();

	   
	}
	
}
