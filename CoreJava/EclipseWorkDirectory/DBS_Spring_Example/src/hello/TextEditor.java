package hello;

public class TextEditor {
	
	SpellChecker spellChecker;
	Multiplication multipler;

	public TextEditor() {
		super();
	}

	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public Multiplication getMultipler() {
		return multipler;
	}

	public void setMultipler(Multiplication multipler) {
		this.multipler = multipler;
	}
	
}
