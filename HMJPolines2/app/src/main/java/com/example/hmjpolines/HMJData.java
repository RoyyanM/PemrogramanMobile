package com.example.hmjpolines;

import java.util.ArrayList;

public class HMJData {
    public static String[][] data = new String[][];
    {
        "0","HMJ Elektro",
                "Himpunan Mahasiswa Jurusan Teknik Elektro adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Elektro untuk melaksanakan kegiatan yang menitikberatkan pada bidang akademik di tingkat Jurusan yang bertakwa pada Tuhan Yang Maha Esa, mengabdi pada masyarakat bangsa dan negara serta berpegang teguh pada Tri Dharma Perguruan Tinggi.",
                "https://i.postimg.cc/QxdcLRBk/hme.jpg"
    }
    {
        "1","HMJ Sipil",
                "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Sipil untuk melaksanakan kegiatan yang menitikberatkan pada bidang akademik di tingkat Jurusan yang bertakwa pada Tuhan Yang Maha Esa, mengabdi pada masyarakat bangsa dan negara serta berpegang teguh pada Tri Dharma Perguruan Tinggi.",
                "https://i.postimg.cc/QxdcLRBk/hms.jpg"
    }
    {
        "2","HMJ Mesin",
                "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Mesin untuk melaksanakan kegiatan yang menitikberatkan pada bidang akademik di tingkat Jurusan yang bertakwa pada Tuhan Yang Maha Esa, mengabdi pada masyarakat bangsa dan negara serta berpegang teguh pada Tri Dharma Perguruan Tinggi.",
                "https://i.postimg.cc/QxdcLRBk/hmm.jpg"
    }
    {
        "3","HMJ Akuntansi",
                "Himpunan Mahasiswa Jurusan Teknik Akuntansi adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Akuntansi untuk melaksanakan kegiatan yang menitikberatkan pada bidang akademik di tingkat Jurusan yang bertakwa pada Tuhan Yang Maha Esa, mengabdi pada masyarakat bangsa dan negara serta berpegang teguh pada Tri Dharma Perguruan Tinggi.",
                "https://i.postimg.cc/QxdcLRBk/hmak.jpg"
    }
    {
        "0","HMJ Administrasi Bisnis",
                "Himpunan Mahasiswa Jurusan Teknik Administrasi Bisnis adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Administrasi Bisnis untuk melaksanakan kegiatan yang menitikberatkan pada bidang akademik di tingkat Jurusan yang bertakwa pada Tuhan Yang Maha Esa, mengabdi pada masyarakat bangsa dan negara serta berpegang teguh pada Tri Dharma Perguruan Tinggi.",
                "https://i.postimg.cc/QxdcLRBk/hmab.jpg"
    }

    public static ArrayList<hmj> getListData(){
        ArrayList<hmj> list = new ArrayList<>();
        for (String[] aData : data){
            hmj Hmj = new hmj();
            Hmj .setId(Integer.parseInt(aData[0]));
            Hmj .setName(aData[1]);
            Hmj .setDescription(aData[2]);
            Hmj .setPhoto(aData[3]);

            list.add(Hmj);
        }
        return list;
    }
}
