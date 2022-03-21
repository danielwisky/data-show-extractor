package br.com.danielwisky.mycrawler.converters;

import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class FilterSubstringBefore implements FilterConverter {

  @Override
  public String convert(final String value, final String[] args) {
    return StringUtils.substringBefore(value, args[INTEGER_ZERO]);
  }
}