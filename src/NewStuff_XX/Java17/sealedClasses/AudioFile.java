package NewStuff_XX.Java17.sealedClasses;

/**
 * telling who can extend class or implement our interface
 * man hat final(keiner darf extenden), sealed(braucht permits) and non sealed(jeder darf extenden)
 * permits -> man sagt wer extenden darf
 */
public sealed abstract class AudioFile permits MP3File {
}
