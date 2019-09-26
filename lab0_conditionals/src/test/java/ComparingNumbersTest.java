import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ComparingNumbersTest {

  @Test
  public void isEven_returnsTrueIfTheNumberIsEven() {
    assertThat(ComparingNumbers.isEvenNumber(2)).isTrue();
    assertThat(ComparingNumbers.isEvenNumber(8)).isTrue();
    assertThat(ComparingNumbers.isEvenNumber(420)).isTrue();
  }

  @Test
  public void isEven_returnsFalseIfTheNumberIsNotEven() {
    assertThat(ComparingNumbers.isEvenNumber(3)).isFalse();
    assertThat(ComparingNumbers.isEvenNumber(0)).isFalse();
    assertThat(ComparingNumbers.isEvenNumber(13)).isFalse();
    assertThat(ComparingNumbers.isEvenNumber(159)).isFalse();
  }

  @Test
  public void isBetween_returnsTrueIfNumberIsInInterval() {
    assertThat(ComparingNumbers.isBetween(5, 1, 10)).isTrue();
    // Edge cases:
    assertThat(ComparingNumbers.isBetween(1, 1, 10)).isTrue();
    assertThat(ComparingNumbers.isBetween(10, 1, 10)).isTrue();
  }

  @Test
  public void isBetween_returnsFalseIfNumberIsNotInInterval() {
    assertThat(ComparingNumbers.isBetween(0, 1, 10)).isFalse();
    assertThat(ComparingNumbers.isBetween(220, 1, 200)).isFalse();
  }

}