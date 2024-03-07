package Sukiri11;
//インターフェイスについて
public interface CleaningService {
	Shirt washShirt(Shirt s);
	Towl washTowl(Towl t);
	Coat washCoat(Coat c);
	//interface：3つのメニューは店とお客様の接点の役割
}
