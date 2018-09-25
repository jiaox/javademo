package com.jiaox.io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 练习 将指定目录(包含子目录)中所有的.java文件的绝对路径存储到一个文件中，也就是建立一个java文件列表，方便日后查询。
 * 
 * 思路 1.对指定目录进行递归 2.在递归中按指定的过滤器进行过滤，并将符合要求的文件进行临时存储。
 * 3.对集合进行遍历，并将集合中的文件路径写入到一个文件中。
 * 
 * @author Administrator
 * 
 */
public class GetJavaFileList {
	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\Workspaces\\MyEclipse10\\daylyDemo");
		List<File> list = new ArrayList<File>();
		FileFilter filter = new SuffixFilter(".java");
		getFiles(dir, list, filter);
		File file = new File(dir, "javalist.txt");
		write2File(list, file);
	}
	public static void getFiles(File dir, List<File> list, FileFilter filter) {
		File[] files = dir.listFiles();
		for (int x = 0; x < files.length; x++) {
			if (files[x].isDirectory()) {
				getFiles(files[x], list, filter);
			} else {
				if (filter.accept(files[x])) {
					list.add(files[x]);
				}
			}
		}
	}
	// 将集合中的文件对象路径写入到文件中。
	public static void write2File(List<File> list, File file) {
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(file));
			for (File f : list) {
				bufw.write(f.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (bufw != null) {
				try {
					bufw.close();
				} catch (IOException e) {
					throw new RuntimeException("写入关闭失败");
				}
			}
		}
	}
}
// 定义一个过滤器,实现filter接口
class SuffixFilter implements FileFilter {
	private String suffix;
	SuffixFilter(String suffix) {
		this.suffix = suffix;
	}
	@Override
	public boolean accept(File file) {
		return file.getName().endsWith(suffix);
	}
}
