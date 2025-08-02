package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String adress = "東京都中野区〇×";

	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です。");
	}
	public abstract void eachIntroduce();
	
	public void execIntroduce(){
		commonIntroduce();    // 共通紹介
        eachIntroduce();      // 個別紹介（子クラスが実装）	
	}
}
