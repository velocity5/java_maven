/*
Core 30-9
- Interface la ban thiet ke giua cac lop, chi dinh cac phuong thuc, truong can co trong cac
lop can trien khai.
- Giong abstract, interfaces ko the dung de tao obj
- Su dung cho da ke thua
- Ko co body, dc cung cap boi viec implement class
- De interface nay su dung interface khac => extends
- Khi dan xuat tu class de su dung interface => implements
- Public: Co quyen dc truy cap cong khai
- Static: co the truy cap ma ko can khoi tao interface
- Final: cac truong trong interface ko thay doi
 */
package tutorial_java.testInterface;

public interface vduInterface {
	int a = 10;
	void display();
}
