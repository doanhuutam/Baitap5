package service;

import down.Crud;
import model.NhanVien;

import java.util.ArrayList;

public class NhanVienService {
    public static ArrayList<NhanVien> list=new ArrayList<>();
    public NhanVienService(){
        try {
            list= Crud.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void save(NhanVien nhanVien){
        try {
            Crud.save(nhanVien);
            list= Crud.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void delete(int id){
        try {
            Crud.delete(id);
            list= Crud.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void  edit(NhanVien nhanvien, int index){
        try {
            Crud.edit(nhanvien);
            list= Crud.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
