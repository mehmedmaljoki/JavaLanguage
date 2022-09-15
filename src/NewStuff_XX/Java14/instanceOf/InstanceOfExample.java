package NewStuff_XX.Java14.instanceOf;

import org.junit.jupiter.api.Test;

public class InstanceOfExample {
	@Test
	public void instanceOfExample() {
		AbstractFile abstractFile = new MusicFile();
		useInstanceOf(abstractFile);
	}

	private void useInstanceOf(AbstractFile abstractFile) {
		// then
		if (abstractFile instanceof MusicFile) {
			((MusicFile) abstractFile).playMusic();
		}

		// now
		if (abstractFile instanceof MusicFile musicFile) {
			musicFile.playMusic();
		}
	}
}
